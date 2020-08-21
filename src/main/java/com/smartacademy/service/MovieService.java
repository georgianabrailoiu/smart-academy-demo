package com.smartacademy.service;

import com.smartacademy.model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> findByCategory(String category);

    List<Movie> findAll();
}
