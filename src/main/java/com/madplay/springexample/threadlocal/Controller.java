package com.madplay.springexample.threadlocal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author madplay
 */
@RestController
public class Controller {
	@GetMapping("/test")
	public String test(@RequestParam(required = false) String id) {
		return id;
	}
}
