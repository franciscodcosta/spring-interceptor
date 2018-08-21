package com.example.sbinterceptor.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptorController {

	@GetMapping("/login")
	public String login(Model model) {

		return "login";
	}

}
