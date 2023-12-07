package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture, Long>{

}
