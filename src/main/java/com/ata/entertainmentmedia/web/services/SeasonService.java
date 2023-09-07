package com.ata.entertainmentmedia.web.services;

import com.ata.entertainmentmedia.data.entities.Season;
import com.ata.entertainmentmedia.data.repos.SeasonRepo;
import com.ata.entertainmentmedia.data.repos.SerieRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeasonService {

    @Autowired
    SeasonRepo seasonRepo;
    @Autowired
    SerieRepo serieRepo;

    public List<Season> getAllSeasons() {
        return seasonRepo.findAll();
    }

    public Season getSeasonById(Long id) {
        return seasonRepo.findById(id).orElseThrow();
    }

    public Season saveSeason(Season season) {
//        Season seasonWithNoFK = season;
//        seasonWithNoFK.setSerie(serieRepo.findById(season.getSerie().getId()).get());
        return seasonRepo.save(season);
    }
}
