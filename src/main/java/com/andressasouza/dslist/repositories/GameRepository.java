package com.andressasouza.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andressasouza.dslist.entities.Game;

// Returns the entities
public interface GameRepository extends JpaRepository<Game, Long> {

}
