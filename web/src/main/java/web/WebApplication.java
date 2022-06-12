package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import web.model.Curso;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebApplication {

	private static final Logger log = LoggerFactory.getLogger(WebApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

	@Bean
  CommandLineRunner execute() {
		RestTemplate consumer = new RestTemplate();
		String       url      = "http://localhost:8080/cursos/1";
		Curso        curso    = consumer.getForObject(url, Curso.class);
    return args -> { log.info(curso.toString()); };
  }
}
