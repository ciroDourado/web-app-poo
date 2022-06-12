package api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import api.model.util.CargaHoraria;
import api.model.entity.*;
import api.model.repository.*;
import java.time.LocalDate;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	// @Bean
  // CommandLineRunner initDatabaseCursos(CursoRepository repository) {
	// 	var spring = new Curso("20HS", LocalDate.now(), "API REST - Spring Boot");
	// 	var laravel = new Curso("30HS", LocalDate.now(), "API REST - Laravel");
	//
  //   return args -> {
  //     log.info("Preloading " + repository.save(spring));
  //     log.info("Preloading " + repository.save(laravel));
  //   };
  // }
	//
	// @Bean
  // CommandLineRunner initDatabaseVideoaulas(VideoaulaRepository repository) {
	// 	var spring  = new Curso(); spring.setId(new Long(1));
	// 	var laravel = new Curso(); laravel.setId(new Long(2));
	//
	// 	var sb_1 = new Videoaula("Aula 01", "...", 1, spring);
	// 	var sb_2 = new Videoaula("Aula 02", "...", 2, spring);
	// 	var lv_1 = new Videoaula("Aula 01 - Parte 1", "...", 3, laravel);
	// 	var lv_2 = new Videoaula("Aula 01 - Parte 2", "...", 4, laravel);
	// 	var lv_3 = new Videoaula("Aula 01 - Parte 3", "...", 5, laravel);
	//
  //   return args -> {
  //     log.info("Preloading " + repository.save(sb_1));
  //     log.info("Preloading " + repository.save(sb_2));
  //     log.info("Preloading " + repository.save(lv_1));
  //     log.info("Preloading " + repository.save(lv_2));
  //     log.info("Preloading " + repository.save(lv_3));
  //   };
  // }
}
