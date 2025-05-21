package com.devsuperior.dslistmaio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslistmaio.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
