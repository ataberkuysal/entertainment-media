package com.ata.entertainmentmedia.data.configs;

import com.ata.entertainmentmedia.data.entities.Movie;
import com.ata.entertainmentmedia.data.repos.MovieRepo;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitialData {

    @Bean
    public ApplicationRunner initializeBaseData(MovieRepo movieRepo) {

        return args -> {

            movieRepo.save(new Movie());


        };
    }
}

