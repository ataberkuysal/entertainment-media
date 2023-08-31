package com.ata.entertainmentmedia.web.services;

import com.ata.entertainmentmedia.data.entities.Season;
import com.ata.entertainmentmedia.data.repos.SeasonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SeasonService {

    SeasonRepo seasonRepo;

    public List<Season> getAllSeasons() {
        return seasonRepo.findAll();
    }

    public Season getSeasonById(Long id) {
        return seasonRepo.findById(id).orElseThrow();
    }

    public Season saveSeason(Season season) {
        return seasonRepo.save(season);
    }
}
