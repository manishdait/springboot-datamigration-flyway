package com.example.springboot_datamigration_flyway.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot_datamigration_flyway.dao.AlienDao;
import com.example.springboot_datamigration_flyway.model.Alien;
import com.example.springboot_datamigration_flyway.model.Tech;
import com.example.springboot_datamigration_flyway.repository.AlienRepository;
import com.example.springboot_datamigration_flyway.repository.TechRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AlienService {
  private final AlienRepository alienRepository;
  private final TechRepository techRepository;

  public List<Alien> getAliens() {
    return alienRepository.findAll();
  }

  @Transactional
  public Alien addAlien(AlienDao request) {
    Optional<Tech> _tech = techRepository.findByTech(request.tech());

    if(_tech.isEmpty()) {
      Tech tech = new Tech();
      tech.setTech(request.tech());
      _tech = Optional.of(techRepository.save(tech));
    }

    Alien alien = new Alien();
    alien.setUsername(request.username());
    alien.setTech(_tech.get());

    return alienRepository.save(alien);
  }
}
