package com.ata.entertainmentmedia.web.services;

import com.ata.entertainmentmedia.data.entities.Episode;
import com.ata.entertainmentmedia.data.repos.EpisodeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpisodeService {

    @Autowired
    private EpisodeRepo episodeRepo;

    public List<Episode> getAllEpisodes() {
        return episodeRepo.findAll();
    }

    public Episode getEpisodeById(Long id) {
        return episodeRepo.findById(id).orElseThrow();
    }

    public Episode saveEpisode(Episode episode){
        return episodeRepo.save(episode);
    }
}
