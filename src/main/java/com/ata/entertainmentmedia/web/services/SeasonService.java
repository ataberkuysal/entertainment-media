package com.ata.entertainmentmedia.web.services;

import com.ata.entertainmentmedia.data.entities.Season;

import java.util.List;

public interface SeasonService {

    /**
     *
     * @return
     */
    List<Season> getAllSeasons();

    /**
     *
     * @param id
     * @return
     */
    Season getSeasonById(Long id);

    /**
     *
     * @param season
     * @return
     */
    Season saveSeason(Season season);
}
