package com.example.springboot_datamigration_flyway.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springboot_datamigration_flyway.dao.AlienDao;
import com.example.springboot_datamigration_flyway.model.Alien;
import com.example.springboot_datamigration_flyway.repository.AlienRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AlienService {
  private final AlienRepository alienRepository;

  public List<Alien> getAliens() {
    return alienRepository.findAll();
  }

  public Alien addAlien(AlienDao request) {
    Alien alien = new Alien();
    alien.setUsername(request.username());

    return alienRepository.save(alien);
  }
}
