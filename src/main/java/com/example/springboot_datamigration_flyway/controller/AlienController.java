package com.example.springboot_datamigration_flyway.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_datamigration_flyway.dao.AlienDao;
import com.example.springboot_datamigration_flyway.model.Alien;
import com.example.springboot_datamigration_flyway.service.AlienService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/alien/api")
@AllArgsConstructor
public class AlienController {
  private final AlienService alienService;

  @GetMapping()
  public ResponseEntity<List<Alien>> getAliens() {
    return ResponseEntity.status(HttpStatus.OK).body(alienService.getAliens());
  }

  @PostMapping()
  public ResponseEntity<Alien> addAlien (@RequestBody AlienDao request) {
    return ResponseEntity.status(200).body(alienService.addAlien(request));
  }
  
}
