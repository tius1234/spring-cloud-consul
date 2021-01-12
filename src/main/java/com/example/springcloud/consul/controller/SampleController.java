package com.example.springcloud.consul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/sample")
	public String getMessage() {
		return "hello consul";
	}
}
