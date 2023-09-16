package com.ata.entertainmentmedia.web.services;

import com.ata.entertainmentmedia.data.entities.Movie;
import com.ata.entertainmentmedia.web.repos.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepo movieRepo;

    @Override
    public List<Movie> getMovies() {
        return movieRepo.findAll();
    }
}
