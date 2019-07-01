package com.example.moviecatalogservice.repository;

import com.example.moviecatalogservice.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

    public interface MovieCatalogRepository extends MongoRepository<Movie, ObjectId> {
}
