package com.panta.presantation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.panta.entities.Serie;
import com.panta.services.SerieService;

@Controller
public class SerieMvc {

	
	@Autowired
	private SerieService service;
	
	@GetMapping("serie")
	public String showForm() {
		return "moduloAdd";
	}
	
	@PostMapping("serie")
	public String addSerie(Serie s) {
		service.addSerie(s);
		
		return "redirect:serie";
	}
	
	@GetMapping("/")
	public String showHome() {
		return "index";
	}
}
