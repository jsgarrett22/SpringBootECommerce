package com.garrett.SpringBootECommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@GetMapping("/")
	@ResponseBody
	public String getHome() {
		return "Home Page Test";
	}
}
