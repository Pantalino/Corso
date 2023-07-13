package com.panta.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panta.entities.Canzone;

public interface CanzoneDAO extends JpaRepository<Canzone, Integer> {

}
