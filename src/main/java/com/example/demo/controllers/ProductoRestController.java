package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoRestController {
	@GetMapping("/hola")
	public String holamundo() {
		return "Hola mundo spring";
	}
}
