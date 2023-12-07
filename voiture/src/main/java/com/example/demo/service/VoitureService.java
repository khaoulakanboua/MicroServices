package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Voiture;
import com.example.demo.repos.VoitureRepository;

@Service
public class VoitureService {

    @Autowired
    private VoitureRepository voitureRepository;

    public Voiture saveVoiture(Voiture voiture){
        return voitureRepository.save(voiture);
    }
}