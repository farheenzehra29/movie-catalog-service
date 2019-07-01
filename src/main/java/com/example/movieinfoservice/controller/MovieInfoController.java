package com.example.movieinfoservice.controller;


import com.example.movieinfoservice.model.Movie;
import com.example.movieinfoservice.service.MovieInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class MovieInfoController {
    private MovieInfoService movieInfoService;

    public MovieInfoController(MovieInfoService movieInfoService) {
        this.movieInfoService = movieInfoService;
    }

    @GetMapping("/{id}")
    public Movie getMovieInfoById(@PathVariable double id) {
        return movieInfoService.getInfoById(id);
    }

}
