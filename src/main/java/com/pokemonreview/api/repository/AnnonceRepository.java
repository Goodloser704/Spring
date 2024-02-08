package com.pokemonreview.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pokemonreview.api.models.Annonce;

import java.util.List;

public interface AnnonceRepository extends MongoRepository<Annonce, String> {
    List<Annonce> findAnnonceByProprietaireId(String proprietaireId);
}
