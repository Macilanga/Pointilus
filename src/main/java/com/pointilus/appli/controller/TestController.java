package com.pointilus.appli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@GetMapping("/test")
	public @ResponseBody String test (){
		System.out.println("test");
		return "TEST";
	}
}
