package com.student.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.page.service.Studentservice;


@Controller
public class Studentcontroller {
	private Studentservice sv;
	public Studentcontroller(Studentservice sv) {
		super();
		this.sv = sv;
	}
	@RequestMapping("/hello")
	public String details(Model model) {
		model.addAttribute("hello", sv.getAlldetails());
		return "hello";
	}

}
