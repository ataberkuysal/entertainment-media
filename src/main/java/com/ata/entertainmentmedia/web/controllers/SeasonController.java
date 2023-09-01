package com.ata.entertainmentmedia.web.controllers;

import com.ata.entertainmentmedia.data.DTOs.SeasonDTO;
import com.ata.entertainmentmedia.data.entities.Season;
import com.ata.entertainmentmedia.web.services.SeasonService;
import com.ata.entertainmentmedia.web.services.SerieService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/seasons")
public class SeasonController {

    @Autowired
    SeasonService seasonService;
    @Autowired
    ModelMapper modelMapper;

    //GET
    @GetMapping("")
    public List<Season> getAllSeasons() {
        return seasonService.getAllSeasons();
    }

    @GetMapping("/{id}")
    public Season getSeasonById(@PathVariable Long id) {
        return seasonService.getSeasonById(id);
    }

    //POST
    @PostMapping("/save")
    public ResponseEntity<SeasonDTO> saveSeason(@RequestBody SeasonDTO seasonDTO) {
        Season seasonRequest = modelMapper.map(seasonDTO, Season.class);

        seasonService.saveSeason(seasonRequest);

        SeasonDTO seasonResponse = modelMapper.map(seasonRequest, SeasonDTO.class);

        return new ResponseEntity<SeasonDTO>(seasonResponse, HttpStatus.CREATED);
    }
}
