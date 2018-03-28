package com.springboot.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/get")
public class WelcomeController {
	
		@RequestMapping("/snacks")
		public String welcome() {
			return "Go and have a cake party!!!!!!";
		}
}
