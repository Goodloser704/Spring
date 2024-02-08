package com.pokemonreview.api.service;
import java.util.List;

import com.pokemonreview.api.models.Annonce;

public interface AnnonceService{
    Annonce saveAnnonce(Annonce annonce);
    List<Annonce> findAll();
    void deleteAnnonce(String idAnnonce);
    List<Annonce> findByIdUser(String idUser);
}