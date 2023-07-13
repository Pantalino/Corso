package com.panta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panta.entities.Serie;
import com.panta.repos.SerieDAO;

@Service
public class SerieServiceImpl implements SerieService {

	@Autowired //crea l'oggetto e lo collega
	private SerieDAO dao;
	
	@Override
	public List<Serie> getSerie() {
		return dao.findAll();
	}

	@Override
	public Serie getSerieById(int id) {
		return dao.getReferenceById(id);
	}

	@Override
	public Serie addSerie(Serie s) {
		return dao.save(s);
	}

	@Override
	public List<Serie> getSerieByRating(double min, double max) {		
		return dao.findByRatingBetween(min, max);
	}

}
