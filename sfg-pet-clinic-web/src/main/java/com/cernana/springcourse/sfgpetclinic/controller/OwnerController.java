package com.cernana.springcourse.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owner")
public class OwnerController {
	
	@RequestMapping({"", "/", "index", "list", "list.html"})
	public String showList() {
		return "owner/list";
	}

}
