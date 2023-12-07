package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Client;
import com.example.demo.model.Voiture;
import com.example.demo.repos.VoitureRepository;

@RestController
public class voitureController {
	@Autowired
    VoitureRepository clientRepository ;
    @GetMapping("/voitures")
    public List<Voiture> chercherClients(){
        return clientRepository.findAll();
    }
    @GetMapping("/voiture/{id}")
    public Voiture chercherUnClients (@PathVariable Long id) throws Exception{

        return this.clientRepository.findById(id).orElseThrow(()-> new Exception("Client inexistant"));}
    
    
}
