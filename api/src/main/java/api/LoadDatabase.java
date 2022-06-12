package api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import api.model.entity.*;
import api.model.repository.*;
import java.time.LocalDate;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
  CommandLineRunner initDatabaseCursos(CursoRepository repository) {
		Long spring = new Long(1);
		System.out.println(repository.findById(spring));
		if (! repository.findById(spring).isPresent()) {
			String    carga  = "20HS";
			LocalDate inicio = LocalDate.now();
			String    titulo = "API REST - Spring Boot";
			repository.save(new Curso(carga, inicio, titulo));
		}
		Long laravel = new Long(2);
		if (! repository.findById(laravel).isPresent()) {
			String    carga   = "30HS";
			LocalDate inicio  = LocalDate.now();
			String    titulo  = "API REST - Laravel";
			repository.save(new Curso(carga, inicio, titulo));
		}
    return args -> { log.info("Migração de cursos completa."); };
  }

	@Bean
  CommandLineRunner initDatabaseVideoaulasLaravel(VideoaulaRepository repository) {
		Curso laravel = new Curso(); laravel.setId(new Long(2));

		Long aula_1 = new Long(1);
		if (! repository.findById(aula_1).isPresent()) {
			String    titulo    = "Aula 01";
			String    descricao = "...";
			int       numero    = 1;
			repository.save(new Videoaula(titulo, descricao, numero, laravel));
		}
		Long aula_2 = new Long(2);
		if (! repository.findById(aula_2).isPresent()) {
			String    titulo    = "Aula 01";
			String    descricao = "...";
			int       numero    = 2;
			repository.save(new Videoaula(titulo, descricao, numero, laravel));
		}
		Long aula_3 = new Long(3);
		if (! repository.findById(aula_3).isPresent()) {
			String    titulo    = "Aula 01";
			String    descricao = "...";
			int       numero    = 3;
			repository.save(new Videoaula(titulo, descricao, numero, laravel));
		}

		return args -> { log.info("Migração das aulas de Laravel completa."); };
  }

	@Bean
  CommandLineRunner initDatabaseVideoaulasSpring(VideoaulaRepository repository) {
		Curso spring  = new Curso(); spring.setId(new Long(1));

		Long aula_4 = new Long(4);
		if (! repository.findById(aula_4).isPresent()) {
			String    titulo    = "Aula 01";
			String    descricao = "...";
			int       numero    = 1;
			repository.save(new Videoaula(titulo, descricao, numero, spring));
		}
		Long aula_5 = new Long(5);
		if (! repository.findById(aula_5).isPresent()) {
			String    titulo    = "Aula 02";
			String    descricao = "...";
			int       numero    = 1;
			repository.save(new Videoaula(titulo, descricao, numero, spring));
		}

		return args -> { log.info("Migração das aulas de Spring Boot completa."); };
  }
}
