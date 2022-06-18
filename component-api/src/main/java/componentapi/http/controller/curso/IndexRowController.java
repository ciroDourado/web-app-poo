package componentapi.http.controller.curso;

import componentapi.model.entity.Curso;
import componentapi.model.component.curso.IndexRow;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="curso")
public class IndexRowController {

  IndexRowController() {}

  @PostMapping(
    value="index_row",
    consumes="application/json"  
  )
  String newIndexRow(@RequestBody Curso curso) {
    IndexRow element = new IndexRow(curso);
    return element.toString();
  }
}
