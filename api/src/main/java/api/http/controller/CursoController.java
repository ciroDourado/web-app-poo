package api.http.controller;

import api.http.exception.CursoNotFoundException;
import api.model.repository.CursoRepository;
import api.model.entity.Curso;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {

  private final CursoRepository repository;

  CursoController(CursoRepository repository) {
    this.repository = repository;
  }


  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/cursos")
  List<Curso> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]

  @PostMapping("/cursos")
  Curso newCurso(@RequestBody Curso newCurso) {
    return repository.save(newCurso);
  }

  // Single item

  @GetMapping("/cursos/{id}")
  Curso one(@PathVariable Long id) {

    return repository
			.findById(id)
      .orElseThrow(() -> new CursoNotFoundException(id));
  }

  @PutMapping("/cursos/{id}")
  Curso replaceCurso(@RequestBody Curso newCurso, @PathVariable Long id) {

    return repository.findById(id)
      .map(curso -> {
        curso.setTitulo(newCurso.getTitulo());
        curso.setCargaHoraria(newCurso.getCargaHoraria());
				curso.setDataInicio(newCurso.getDataInicio());
				curso.setVideoaulas(newCurso.getVideoaulas());
        return repository.save(curso);
      })
      .orElseGet(() -> {
        newCurso.setId(id);
        return repository.save(newCurso);
      });
  }

  @DeleteMapping("/cursos/{id}")
  void deleteCurso(@PathVariable Long id) {
    repository.deleteById(id);
  }
}
