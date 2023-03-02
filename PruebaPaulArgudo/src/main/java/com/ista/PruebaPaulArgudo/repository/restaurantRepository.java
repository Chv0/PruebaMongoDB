package com.ista.PruebaPaulArgudo.repository;

import com.ista.PruebaPaulArgudo.models.Restaurante;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface restaurantRepository extends MongoRepository<Restaurante, Long> {
}
