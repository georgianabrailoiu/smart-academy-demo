package com.smartacademy.controller;

import com.smartacademy.model.Movie;
import com.smartacademy.service.MovieService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping(value = "/api/movies", produces = "application/json")
    public List<String> getMoviesByCategory(@RequestParam(required = false) final String category) {
        List<Movie> movies = new ArrayList<>();
        if (StringUtils.isEmpty(category)) {
            movies = movieService.findAll();
        } else {
            movies = movieService.findByCategory(category);
        }
        if (movies.isEmpty()) {
            return new ArrayList<>();
        }
        return movies.stream().map(Movie::getName).collect(Collectors.toList());
    }
}