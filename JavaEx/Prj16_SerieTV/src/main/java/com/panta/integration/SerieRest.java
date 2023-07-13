package com.panta.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.panta.entities.Serie;
import com.panta.services.SerieService;

@RestController
@RequestMapping("api")
public class SerieRest {

	@Autowired
	private SerieService service;
	
	@GetMapping("serie")
	public List<Serie> getSerie(){
		return service.getSerie();
	}
	
	
	
}
