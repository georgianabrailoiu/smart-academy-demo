package com.smartacademy.service;

import com.smartacademy.model.Movie;
import com.smartacademy.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("movieService")
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public List<Movie> findByCategory(String category) {
        return movieRepository.findByCategory(category);
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }
}
