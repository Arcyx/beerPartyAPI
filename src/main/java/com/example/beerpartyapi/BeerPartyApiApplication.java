package com.example.beerpartyapi;

import com.example.beerpartyapi.respository.UserRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableMongoRepositories
@EnableWebSecurity
public class BeerPartyApiApplication {

    @Autowired
    UserRepository userRepo;
    private static final Log log = LogFactory.getLog(BeerPartyApiApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BeerPartyApiApplication.class, args);
       // log.info(userRepo.findOne(new Query(where("name").is("Joe")), Person.class));
    }

}
