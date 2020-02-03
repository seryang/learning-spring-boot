package com.greglturnquist.learningspringboot;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * ChapterRepository
 *
 * @author seryang.choe (seryang.choe@navercorp.com)
 */
public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String> {

}
