package com.cernana.springcourse.sfgpetclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cernana.springcourse.sfgpetclinic.service.VetService;

@Controller
@RequestMapping("/vet")
public class VetController {

	private VetService vetService;

	@Autowired
	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}

	@RequestMapping({ "", "/", "index", "list", "list.html" })
	public String showList(Model model) {
		model.addAttribute("vetList", vetService.findAll());
		return "vet/list";
	}

}
