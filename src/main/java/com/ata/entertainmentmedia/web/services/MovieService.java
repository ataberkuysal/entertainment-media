package com.ata.entertainmentmedia.web.services;

import com.ata.entertainmentmedia.data.entities.Movie;
import com.ata.entertainmentmedia.data.repos.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepo movieRepo;

    public List<Movie> getMovies() {
        return movieRepo.findAll();
    }
}
