package web.controller;

import web.model.entity.Curso;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Controller
public class CursoController {

	@GetMapping("/cursos")
	public String index(Model model) {
		RestTemplate consumer = new RestTemplate();
		String       url      = "http://localhost:8080/cursos";
		Curso[]      cursos   = consumer.getForEntity(url, Curso[].class).getBody();

		model.addAttribute("cursos", cursos);
		return "cursos/index";
	}
}
