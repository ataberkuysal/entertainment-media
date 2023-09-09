package com.ata.entertainmentmedia.web.services;

import com.ata.entertainmentmedia.data.entities.Episode;
import com.ata.entertainmentmedia.data.repos.EpisodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class EpisodeServiceImpl implements EpisodeService{

    @Autowired
    private EpisodeRepo episodeRepo;

    @Override
    public List<Episode> getAllEpisodes() {
        return episodeRepo.findAll();
    }
    @Override
    public Episode getEpisodeById(Long id) {
        return episodeRepo.findById(id).orElseThrow();
    }
    @Override
    public Episode saveEpisode(Episode episode){
        return episodeRepo.save(episode);
    }
}
