package com.ata.entertainmentmedia.web.controllers;

import com.ata.entertainmentmedia.data.dtos.SeasonDTOwithSerieId;
import com.ata.entertainmentmedia.data.entities.Season;
import com.ata.entertainmentmedia.web.exceptions.custom_exceptions.NoSuchSerieIdException;
import com.ata.entertainmentmedia.web.services.SeasonService;
import com.ata.entertainmentmedia.web.services.SerieService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

@Slf4j
@RestController
@RequestMapping("/seasons")
public class SeasonController {

    @Autowired
    SeasonService seasonService;
    @Autowired
    SerieService serieService;
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
    public ResponseEntity<SeasonDTOwithSerieId> saveSeason(@RequestBody SeasonDTOwithSerieId seasonDTOwithSerieId)
    /*throws NoSuchSerieIdException*/{

        Season seasonRequest = modelMapper.map(seasonDTOwithSerieId, Season.class);

        /*try {
            seasonRequest.setSerie(serieService.getSerieById(seasonDTOwithSerieId.getSerieId()));
        }catch (NoSuchElementException e){
            throw new NoSuchSerieIdException("Given serieId is not present in series or given as null");
        }*/
        seasonRequest.setSerie(serieService.getSerieById(seasonDTOwithSerieId.getSerieId()));

        seasonService.saveSeason(seasonRequest);


        ////BELOW THIS OR AFTER THE save() METHOD OF REPO , NO MORE CHANGES TO THE DATABASE CAN ACTUALLY BE MADE
        SeasonDTOwithSerieId seasonResponse = modelMapper.map(seasonRequest, SeasonDTOwithSerieId.class);

        return new ResponseEntity<SeasonDTOwithSerieId>(seasonResponse, HttpStatus.CREATED);
    }
}
