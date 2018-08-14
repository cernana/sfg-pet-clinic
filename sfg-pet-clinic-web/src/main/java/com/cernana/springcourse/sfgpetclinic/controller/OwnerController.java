package com.cernana.springcourse.sfgpetclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cernana.springcourse.sfgpetclinic.service.OwnerService;

@Controller
@RequestMapping("/owner")
public class OwnerController {
	
	private OwnerService ownerService;
	
	@Autowired
	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}
	
	@RequestMapping({"", "/", "index", "list", "list.html"})
	public String showList(Model model) {
		model.addAttribute("ownerList", ownerService.findAll());
		return "owner/list";
	}

}
