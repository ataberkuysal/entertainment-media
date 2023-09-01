package com.ata.entertainmentmedia.web.controllers;

import com.ata.entertainmentmedia.data.entities.Episode;
import com.ata.entertainmentmedia.data.entities.Movie;
import com.ata.entertainmentmedia.data.entities.Season;
import com.ata.entertainmentmedia.data.entities.Serie;
import com.ata.entertainmentmedia.data.repos.EpisodeRepo;
import com.ata.entertainmentmedia.data.repos.MovieRepo;
import com.ata.entertainmentmedia.data.repos.SeasonRepo;
import com.ata.entertainmentmedia.data.repos.SerieRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/media")
public class MediaController {

    @Autowired
    MovieRepo movieRepo;
    @Autowired
    SerieRepo serieRepo;
    @Autowired
    SeasonRepo seasonRepo;
    @Autowired
    EpisodeRepo episodeRepo;


    ////// MOVIES /////////

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movieRepo.findAll();
    }

    @PostMapping("/movies/create")
    public void createMovie(@RequestBody Movie movie) {

        movieRepo.save(movie);
    }

}
