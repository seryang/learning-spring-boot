package com.greglturnquist.learningspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

/**
 * ChapterController
 *
 * @author seryang.choe (seryang.choe@navercorp.com)
 */
@RestController
public class ChapterController {

	private final ChapterRepository chapterRepository;

	public ChapterController(ChapterRepository chapterRepository) {
		this.chapterRepository = chapterRepository;
	}

	@GetMapping("/chapters")
	public Flux<Chapter> listing() {
		return chapterRepository.findAll();
	}
}
