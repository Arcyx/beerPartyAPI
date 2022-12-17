package com.example.beerpartyapi.controllers;

import com.example.beerpartyapi.model.Beer;
import com.example.beerpartyapi.model.Rating;
import com.example.beerpartyapi.model.User;
import com.example.beerpartyapi.respository.BeerRepository;
import com.example.beerpartyapi.respository.RatingRepository;
import com.example.beerpartyapi.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class beerPartyControllers {
    @Autowired
    UserRepository userRepository;
    @Autowired
    BeerRepository beerRepository;
    @Autowired
    RatingRepository ratingRepository;
    // save user
    @PostMapping("/register")
    public void register(@RequestBody User user) {
        userRepository.save(user);
    }
    // save rating
    @PostMapping("/ratings")
    public void register(@RequestBody Rating rating) {
        ratingRepository.save(rating);
    }
    @GetMapping("/beers")
    public List<Beer> getBeers() {
        return beerRepository.findAll();
    }
    @GetMapping("/ratings")
    public List<Rating> getRatings() {
        return ratingRepository.findAll();
    }

//    // save rating
//    @PostMapping("/test")
//    String test() {
//        return ("hello");
//    }
//    // get beerData
//    @GetMapping("/test")
//    List<> test() {
//        return ("hello");
//    }
//
//    // get ratings
//    @GetMapping("/test")
//    String test() {
//        return ("hello");
//    }
}
