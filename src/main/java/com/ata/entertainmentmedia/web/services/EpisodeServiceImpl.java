package com.ata.entertainmentmedia.web.services;

import com.ata.entertainmentmedia.data.dtos.EpisodeDTO;
import com.ata.entertainmentmedia.data.entities.Episode;
import com.ata.entertainmentmedia.utils.logging.Log;
import com.ata.entertainmentmedia.utils.mappers.UpdateEpisodeMapper;
import com.ata.entertainmentmedia.web.repos.EpisodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class EpisodeServiceImpl implements EpisodeService{

    @Autowired
    private EpisodeRepo episodeRepo;
    @Autowired
    private UpdateEpisodeMapper updateEpisodeMapper;

    @Override
    @Log
    public List<Episode> getAllEpisodes() {
        return episodeRepo.findAll();
    }

    @Override
    @Log
    public Episode getEpisodeById(Long id) {
        return episodeRepo.findById(id).orElseThrow();
    }

    @Override
    @Log
    public Episode saveEpisode(Episode episode){
        return episodeRepo.save(episode);
    }

    @Override
    @Log
    public Episode updateEpisode(EpisodeDTO episodeDTO, Long id) {
         Episode episodeToBeUpdated = getEpisodeById(id);
         updateEpisodeMapper.updateEpisodeFromDTO(episodeDTO, episodeToBeUpdated);
         return saveEpisode(episodeToBeUpdated);
    }
}
