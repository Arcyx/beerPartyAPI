package com.example.beerpartyapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("beer")
@Data
public class Beer {
    @Id
    private String id;
    private String name;
    private Double abv;
    private String style;
    private String brewery;
    private String country;
    private String code;
    private Integer order;
}

