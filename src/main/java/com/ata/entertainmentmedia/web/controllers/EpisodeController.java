package com.ata.entertainmentmedia.web.controllers;

import com.ata.entertainmentmedia.data.DTOs.EpisodeDTO;
import com.ata.entertainmentmedia.data.entities.Episode;
import com.ata.entertainmentmedia.data.repos.EpisodeRepo;
import com.ata.entertainmentmedia.web.services.EpisodeService;
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
    public ResponseEntity<EpisodeDTO> saveEpisode(@RequestBody EpisodeDTO episodeDTO) {

        Episode episodeRequest = modelMapper.map(episodeDTO, Episode.class);

        episodeService.saveEpisode(episodeRequest);

        EpisodeDTO episodeResponse = modelMapper.map(episodeRequest, EpisodeDTO.class);

        return new ResponseEntity<EpisodeDTO>(episodeResponse, HttpStatus.CREATED);
    }
}
