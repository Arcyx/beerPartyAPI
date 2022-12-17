package com.example.beerpartyapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Immutable;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("rating")
@Data
public class Rating {
    @Id
    private String id;
    private String username;
    private String beername;
    private Integer totalScore;
    List<Criteria> ratings;
}

