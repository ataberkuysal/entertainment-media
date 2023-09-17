package com.ata.entertainmentmedia.web.controllers;

import com.ata.entertainmentmedia.data.dtos.EpisodeDTO;
import com.ata.entertainmentmedia.data.dtos.EpisodeDTOwithSeasonId;
import com.ata.entertainmentmedia.data.dtos.SeasonDTO;
import com.ata.entertainmentmedia.data.entities.Episode;
import com.ata.entertainmentmedia.data.entities.Season;
import com.ata.entertainmentmedia.web.services.EpisodeService;
import com.ata.entertainmentmedia.web.services.SeasonService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/episodes")
public class EpisodeController {

    @Autowired
    EpisodeService episodeService;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    private SeasonService seasonService;

    //GET
    @GetMapping("")
    public List<Episode> getAllEpisodes() {
        return episodeService.getAllEpisodes();
    }


    @GetMapping("/{id}")
    public Episode getEpisodeById(@PathVariable Long id) {
        return episodeService.getEpisodeById(id);
    }

    //POST

    @PostMapping("/save")
    public ResponseEntity<EpisodeDTOwithSeasonId> saveEpisode(@RequestBody EpisodeDTOwithSeasonId episodeDTOwithSeasonId) {

        Episode episodeRequest = modelMapper.map(episodeDTOwithSeasonId, Episode.class);

        episodeRequest.setSeason(seasonService.getSeasonById(episodeDTOwithSeasonId.getSeasonId()));

        episodeService.saveEpisode(episodeRequest);

        EpisodeDTOwithSeasonId episodeResponse = modelMapper.map(episodeRequest, EpisodeDTOwithSeasonId.class);

        return new ResponseEntity<EpisodeDTOwithSeasonId>(episodeResponse, HttpStatus.CREATED);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<EpisodeDTO> updateEpisode(@RequestBody EpisodeDTO episodeDTO, @PathVariable Long id) {

        Episode updatedEpisode = episodeService.updateEpisode(episodeDTO, id);

        EpisodeDTO updatedEpisodeDTO = modelMapper.map(updatedEpisode, EpisodeDTO.class);

        return ResponseEntity.ok().body(updatedEpisodeDTO);

    }
}
