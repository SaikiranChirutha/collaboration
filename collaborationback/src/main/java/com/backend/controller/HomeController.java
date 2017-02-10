package com.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("testing")
	public String index()
	{
		System.out.println(" I am from controller");
		return "index";
	}

}
