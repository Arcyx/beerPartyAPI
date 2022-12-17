package com.example.beerpartyapi.respository;

import com.example.beerpartyapi.model.Beer;
import com.example.beerpartyapi.model.Rating;
import com.example.beerpartyapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RatingRepository extends MongoRepository<Rating, String> {
    Rating findAllById();
}
