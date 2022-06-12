package api.http.controller;

import api.http.exception.VideoaulaNotFoundException;
import api.model.repository.VideoaulaRepository;
import api.model.entity.Videoaula;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoaulaController {

  private final VideoaulaRepository repository;

  VideoaulaController(VideoaulaRepository repository) {
    this.repository = repository;
  }


  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/videoaulas")
  List<Videoaula> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]

  @PostMapping("/videoaulas")
  Videoaula newVideoaula(@RequestBody Videoaula newVideoaula) {
    return repository.save(newVideoaula);
  }

  // Single item

  @GetMapping("/videoaulas/{id}")
  Videoaula one(@PathVariable Long id) {

    return repository
			.findById(id)
      .orElseThrow(() -> new VideoaulaNotFoundException(id));
  }

  @PutMapping("/videoaulas/{id}")
  Videoaula replaceVideoaula(@RequestBody Videoaula newVideoaula, @PathVariable Long id) {

    return repository.findById(id)
      .map(videoaula -> {
        videoaula.setTitulo(newVideoaula.getTitulo());
        videoaula.setDescricao(newVideoaula.getDescricao());
				videoaula.setNumero(newVideoaula.getNumero());
				videoaula.setCurso(newVideoaula.getCurso());
        return repository.save(videoaula);
      })
      .orElseGet(() -> {
        newVideoaula.setId(id);
        return repository.save(newVideoaula);
      });
  }

  @DeleteMapping("/videoaulas/{id}")
  void deleteVideoaula(@PathVariable Long id) {
    repository.deleteById(id);
  }
}
