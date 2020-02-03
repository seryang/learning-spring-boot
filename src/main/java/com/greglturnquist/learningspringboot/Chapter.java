package com.greglturnquist.learningspringboot;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * Chapter
 *
 * @author seryang.choe (seryang.choe@navercorp.com)
 */
@Data
@Document
public class Chapter {
	@Id
	private String id;
	private String name;

	public Chapter(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Chapter{" +
			"id='" + id + '\'' +
			", name='" + name + '\'' +
			'}';
	}
}
