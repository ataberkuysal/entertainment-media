package com.ata.entertainmentmedia.data.configs;

import com.ata.entertainmentmedia.data.entities.Episode;
import com.ata.entertainmentmedia.data.entities.Movie;
import com.ata.entertainmentmedia.data.entities.Season;
import com.ata.entertainmentmedia.data.entities.Serie;
import com.ata.entertainmentmedia.data.repos.EpisodeRepo;
import com.ata.entertainmentmedia.data.repos.MovieRepo;
import com.ata.entertainmentmedia.data.repos.SeasonRepo;
import com.ata.entertainmentmedia.data.repos.SerieRepo;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

@Configuration
public class InitialDataLoad implements Serializable {

    @Bean
    public CommandLineRunner initializeBaseData(MovieRepo movieRepo,
                                                SerieRepo serieRepo,
                                                SeasonRepo seasonRepo,
                                                EpisodeRepo episodeRepo) {

        return args -> {

            /*movieRepo.save(new Movie());

            serieRepo.save(new Serie());

            seasonRepo.save(new Season());

            episodeRepo.save(new Episode());*/



        };
    }
}

