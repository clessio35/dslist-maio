package com.devsuperior.dslistmaio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslistmaio.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
