package com.example.beerpartyapi.respository;

import com.example.beerpartyapi.model.Beer;
import com.example.beerpartyapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BeerRepository extends MongoRepository<Beer, String> {
    Beer findAllById();
}
