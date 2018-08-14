package com.cernana.springcourse.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping({"", "/", "index", "index.html"})
	public String showIndex() {
		return "index";
	}

}