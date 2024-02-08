package com.pokemonreview.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemonreview.api.models.Annonce;
import com.pokemonreview.api.repository.AnnonceRepository;
import com.pokemonreview.api.service.AnnonceService;

import java.util.List;


@Service
public class AnnonceServiceImpl implements AnnonceService{
    @Autowired
    private final AnnonceRepository annonceRepository;

    @Autowired
    public AnnonceServiceImpl(AnnonceRepository annonceRepository) {
        this.annonceRepository = annonceRepository;
    }

    @Override
    public List<Annonce> findAll(){
        return annonceRepository.findAll();
    }

    @Override
    public Annonce saveAnnonce(Annonce annonce){
        return annonceRepository.save(annonce);
    }

    @Override 
    public void deleteAnnonce(String idAnnonce){
        annonceRepository.deleteById(idAnnonce);
    }

    @Override
    public List<Annonce> findByIdUser(String idUser){
        return annonceRepository.findAnnonceByProprietaireId(idUser);
    }

}
