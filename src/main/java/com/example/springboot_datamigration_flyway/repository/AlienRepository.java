package com.example.springboot_datamigration_flyway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot_datamigration_flyway.model.Alien;

@Repository
public interface AlienRepository extends JpaRepository<Alien, Long> {
  
}