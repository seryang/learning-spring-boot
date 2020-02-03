package com.greglturnquist.learningspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reactor.core.publisher.Flux;

/**
 * LoadDataBase
 *
 * @author seryang.choe (seryang.choe@navercorp.com)
 */
@Configuration
public class LoadDataBase {

	@Bean
	CommandLineRunner init(ChapterRepository repository) {
		return args -> {
			Flux.just(
				new Chapter("Quick Start with Java"),
				new Chapter("Reactive Web with Spring Boot"),
				new Chapter("...and more!"))
				.flatMap(repository::save)
				.subscribe(System.out::println);
		};
	}
}
