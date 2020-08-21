package com.smartacademy.repository;

import com.smartacademy.model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

    List<Movie> findByCategory(String category);

    List<Movie> findAll();
}
