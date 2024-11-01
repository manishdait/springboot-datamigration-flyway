package com.example.springboot_datamigration_flyway.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot_datamigration_flyway.model.Tech;

@Repository
public interface TechRepository extends JpaRepository<Tech, Long> {
  Optional<Tech> findByTech(String tech);
}
