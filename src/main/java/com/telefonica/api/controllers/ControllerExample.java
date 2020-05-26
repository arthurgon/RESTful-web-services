package com.telefonica.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/example")
public class ControllerExample {

	@GetMapping(value = "/{name}")
	public String example(@PathVariable("name") String name) {
		 return "Hello " + name;
	}
}
