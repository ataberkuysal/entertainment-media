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


    /////////// SERIES - SEASONS - EPISODES //////////////


    //
    @GetMapping("/series")
    public List<Serie> getSeries() {
        return serieRepo.findAll();
    }

    @PostMapping("/series/create")
    public void createSeries(@RequestBody Serie serie) {

        serieRepo.save(serie);
    }

    //
    @GetMapping("/seasons")
    public List<Season> getSeasons() {
        return seasonRepo.findAll();
    }

    @PostMapping("/seasons/create")
    public void createSeasons(@RequestBody Season season) {

        seasonRepo.save(season);
    }

    //
    @GetMapping("/episodes")
    public List<Episode> getEpisodes() {
        return episodeRepo.findAll();
    }

    @PostMapping("/episodes/create")
    public void createEpisodes(@RequestBody Episode episode) {

        episodeRepo.save(episode);
    }



}
