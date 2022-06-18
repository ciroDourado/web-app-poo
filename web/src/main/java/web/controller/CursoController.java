package web.controller;

import web.model.entity.Curso;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.http.MediaType;
import reactor.core.publisher.Mono;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;

@Controller
public class CursoController {

  private final WebClient dataClient;
  private final WebClient componentClient;

	CursoController() {
		this.dataClient = WebClient.builder()
			.baseUrl("http://localhost:8080/cursos")
			.build();

		this.componentClient = WebClient.builder()
			.baseUrl("http://localhost:8082/curso")
			.build();
	}

	@GetMapping("/cursos")
	public String index(Model model) {
		// receber dados da API
		Curso[] cursos = this.dataClient
			.get()
			.retrieve()
			.bodyToMono(Curso[].class)
			.onErrorReturn(new Curso[]{})
			.block();

		// converter cada dado em um json
		String[] jsons = Arrays
			.stream(cursos)
			.map(curso -> curso.toString())
			.toArray(String[]::new);

		// enviar dados ao Component Service
		String[] componentes = Arrays
			.stream(jsons)
			.map(json -> this.componentClient
				.post()
				.uri("/index_row")
				.contentType(MediaType.APPLICATION_JSON)
				.body(Mono.just(json), String.class)
				.retrieve()
				.bodyToMono(String.class)
				.onErrorReturn("")
				.block()
			).toArray(String[]::new);

		model.addAttribute("cursos", cursos);
		model.addAttribute("componentes", componentes);
		return "cursos/index";
	}
}
