package com.ata.entertainmentmedia.data.configs;

import com.ata.entertainmentmedia.web.repos.EpisodeRepo;
import com.ata.entertainmentmedia.web.repos.MovieRepo;
import com.ata.entertainmentmedia.web.repos.SeasonRepo;
import com.ata.entertainmentmedia.web.repos.SerieRepo;
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

