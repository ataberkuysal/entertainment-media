package com.ata.entertainmentmedia.web.controllers;

import com.ata.entertainmentmedia.data.entities.Movie;
import com.ata.entertainmentmedia.data.repos.MovieRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/media/movies")
public class MovieController {

    @Autowired
    MovieRepo movieRepo;

    @GetMapping("")
    public List<Movie> getMovies() {
        return movieRepo.findAll();
    }

    @PostMapping("/create")
    public void createMovie(@RequestBody Movie movie) {

        movieRepo.save(movie);
    }
}
