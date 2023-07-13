package com.panta.services;

import java.util.List;

import com.panta.entities.Serie;

public interface SerieService {

	List<Serie> getSerie();
	Serie getSerieById(int id);
	Serie addSerie(Serie s);
	List<Serie> getSerieByRating(double min, double max);
	
	
}
