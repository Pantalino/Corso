package com.panta.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panta.entities.Serie;
import java.util.List;


public interface SerieDAO extends JpaRepository<Serie, Integer> {

	List<Serie> findByRatingBetween(double min, double max);
	
	
}
