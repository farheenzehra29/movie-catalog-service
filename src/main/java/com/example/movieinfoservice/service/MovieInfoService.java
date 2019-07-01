package com.example.movieinfoservice.service;

import com.example.movieinfoservice.model.Movie;
import com.example.movieinfoservice.repository.MovieInfoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class MovieInfoService {
    private MovieInfoRepository movieInfoRepository;

    public MovieInfoService(MovieInfoRepository movieInfoRepository) {
        this.movieInfoRepository = movieInfoRepository;
    }

    public Movie  getInfoById(@PathVariable double id) {
        return movieInfoRepository.findById(id);


    }
}
