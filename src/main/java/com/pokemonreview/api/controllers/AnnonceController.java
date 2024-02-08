package com.pokemonreview.api.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.pokemonreview.api.models.Annonce;
import com.pokemonreview.api.service.AnnonceService;

import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@RestController
@RequestMapping("/api/annonce")
@CrossOrigin(origins = "*")
@Service
public class AnnonceController {

    @Autowired
    private AnnonceService annonceService;

    @PostMapping("/save")
    @CrossOrigin(origins = "*")
    public Annonce saveAnnonce(@RequestBody Annonce Annonce) {
        return annonceService.saveAnnonce(Annonce);
    }

    @GetMapping("/all")
    @CrossOrigin(origins = "*")
    public List<Annonce> findAll() {
        return annonceService.findAll();
    }

    @DeleteMapping("delete/{id}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<String> deleteAnnonce(@PathVariable String id) {
        annonceService.deleteAnnonce(id);
        return new ResponseEntity<>("Annonce supprimée avec succès", HttpStatus.OK);
    }

    @GetMapping("proprietaire/{id}")
    @CrossOrigin(origins = "*")
    public List<Annonce> findByIdProprietaire(@PathVariable String id){
        return annonceService.findByIdUser(id);
    }
}
