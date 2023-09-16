package com.ata.entertainmentmedia.web.controllers;

import com.ata.entertainmentmedia.data.dtos.SerieDTO;
import com.ata.entertainmentmedia.data.entities.Serie;
import com.ata.entertainmentmedia.web.services.SerieService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/series")
public class SerieController {

    @Autowired
    SerieService serieService;
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    ModelMapper modelMapperPartial;

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

    @PutMapping("/update/{id}")
    public ResponseEntity<SerieDTO> updateSerie(@RequestBody SerieDTO serieDTO, @PathVariable Long id) {

        Serie serieToBeUpdated  = serieService.getSerieById(id);

/*        List<Field> fields = Arrays.stream(serieToBeUpdated.getClass().getDeclaredFields())
                .filter(Objects::nonNull).toList()
                .stream().map(f -> f.getClass().getMethod("get{}",f.getName())).invoke(f);*/

        modelMapperPartial.getConfiguration().setPropertyCondition(Conditions.isNotNull());

        serieToBeUpdated = modelMapperPartial.map(serieDTO, Serie.class);

        serieService.saveSerie(serieToBeUpdated);

        SerieDTO updatedSerieDTO = modelMapper.map(serieToBeUpdated, SerieDTO.class);

        return ResponseEntity.ok().body(updatedSerieDTO);

        /*return serieService.getSerieById(id)
                .map(address -> {
                    address.setCity(newAddress.getCity());
                    address.setPin(newAddress.getPostalCode());
                    return repository.save(address);
                })
                .orElseGet(() -> {
                    return repository.save(newAddress);
                });*/
    }

}
