package com.example.moviecatalogservice.service;


import com.example.moviecatalogservice.model.Movie;
import com.example.moviecatalogservice.repository.MovieCatalogRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service

public class MovieCatalogDataService
{
    private MovieCatalogRepository movieCatalogRepository;
    private MongoTemplate mongoTemplate;
    public MovieCatalogDataService(MovieCatalogRepository movieCatalogRepository,MongoTemplate mongoTemplate){
        this.movieCatalogRepository=movieCatalogRepository;
        this.mongoTemplate=mongoTemplate;
    }
    public List<Movie> findAll(){
        return movieCatalogRepository.findAll();
    }
}
