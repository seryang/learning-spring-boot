package com.greglturnquist.learningspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HomeController
 *
 * @author seryang.choe (seryang.choe@navercorp.com)
 */
@RestController
public class HomeController {

	@GetMapping
	public String greeting(@RequestParam(required = false, defaultValue = "") String name) {
		return name.equals("") ? "Hey!" : "Hey, " + name + "!";
	}
}
