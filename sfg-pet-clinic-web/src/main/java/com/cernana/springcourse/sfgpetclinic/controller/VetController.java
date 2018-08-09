package com.cernana.springcourse.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vet")
public class VetController {
	
	@RequestMapping({"", "/", "index", "list", "list.html"})
	public String showList() {
		return "vet/list";
	}

}
