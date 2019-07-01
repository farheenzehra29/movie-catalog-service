package com.example.moviecatalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(value = "Movie")
public class Movie {



    @Field("id")
    private double id;

    @Field("name")
    private String name;

    @Field("description")
    private String description;

    @Field("rating")
    private double rating;
}

