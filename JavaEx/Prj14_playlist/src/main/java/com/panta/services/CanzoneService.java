package com.panta.services;

import java.util.List;

import com.panta.entities.Canzone;

public interface CanzoneService {

	
	List<Canzone> getCanzoni();
	List<Canzone> getCanzoniByCantante(String cantante);
	Canzone getCanzoneById(int id);
}
