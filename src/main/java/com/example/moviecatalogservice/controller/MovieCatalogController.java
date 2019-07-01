package com.example.moviecatalogservice.controller;


import com.example.moviecatalogservice.model.Movie;
import com.example.moviecatalogservice.service.MovieCatalogDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {


    private MovieCatalogDataService movieCatalogDataService;
    public MovieCatalogController(MovieCatalogDataService movieCatalogDataService){
        this.movieCatalogDataService=movieCatalogDataService;
    }
    @GetMapping("/all")
    public List<Movie> getAllCatalog(){
        return movieCatalogDataService.findAll();

    }
}
