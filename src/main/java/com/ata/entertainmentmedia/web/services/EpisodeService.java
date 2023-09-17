package com.ata.entertainmentmedia.web.services;

import com.ata.entertainmentmedia.data.dtos.EpisodeDTO;
import com.ata.entertainmentmedia.data.entities.Episode;

import java.util.List;

public interface EpisodeService {

    /**
     *
     * @return
     */
    List<Episode> getAllEpisodes();

    /**
     *
     * @param id
     * @return
     */
    Episode getEpisodeById(Long id);

    /**
     *
     * @param episode
     * @return
     */
    Episode saveEpisode(Episode episode);

    Episode updateEpisode(EpisodeDTO episodeDTO, Long id);
}
