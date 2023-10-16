package com.ata.entertainmentmedia.web.controllers;

import com.ata.entertainmentmedia.data.dtos.SerieDTO;
import com.ata.entertainmentmedia.data.entities.Serie;
import com.ata.entertainmentmedia.web.services.SerieService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/series")
public class SerieController {

    @Autowired
    SerieService serieService;
    @Autowired
    ModelMapper modelMapper;

    //GET

    @GetMapping("")
    public List<SerieDTO> getAllSeries(){

        //return serieService.getAllSeries();
        return serieService.getAllSeries()
                .stream().map(serie -> modelMapper.map(serie, SerieDTO.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public Serie getSerieById(@PathVariable Long id){
        return serieService.getSerieById(id);
    }

    //POST

    @PostMapping("/save")
    public ResponseEntity<SerieDTO> saveSerie(@RequestBody SerieDTO serieDTO){

        Serie serieRequest = modelMapper.map(serieDTO, Serie.class);

        Serie savedSerie = serieService.saveSerie(serieRequest);

        SerieDTO serieResponse = modelMapper.map(savedSerie, SerieDTO.class);

        return new ResponseEntity<SerieDTO>(serieResponse, HttpStatus.CREATED);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<SerieDTO> updateSerie(@RequestBody SerieDTO serieDTO, @PathVariable Long id) {

        Serie updatedSerie = serieService.updateSerie(serieDTO, id);

        SerieDTO updatedSerieDTO = modelMapper.map(updatedSerie, SerieDTO.class);

        return ResponseEntity.ok().body(updatedSerieDTO);

    }

}
