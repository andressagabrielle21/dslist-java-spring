package com.andressasouza.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andressasouza.dslist.dto.GameMinDTO;
import com.andressasouza.dslist.entities.Game;
import com.andressasouza.dslist.repositories.GameRepository;

// Services components must be returning DTO
// Simple components must de REGISTERED 
@Service
public class GameService {

  @Autowired //É necessário injetar, relacionar todas as camadas uma nas outras 
  private GameRepository gameRepository;

  public List<GameMinDTO> findAll() {
    List<Game> data = gameRepository.findAll();
    List<GameMinDTO> dto = data.stream().map(item -> new GameMinDTO(item)).toList();
    return dto;
  }
}
