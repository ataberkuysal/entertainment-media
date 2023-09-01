package com.ata.entertainmentmedia.web.services;

import com.ata.entertainmentmedia.data.entities.Serie;
import com.ata.entertainmentmedia.data.repos.SerieRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class SerieService {

    @Autowired
    SerieRepo serieRepo;


    public List<Serie> getAllSeries(){
        return serieRepo.findAll();
    }


    public Serie getSerieById(Long id){
        return serieRepo.findById(id).orElseThrow();
    }

    public Serie saveSerie(Serie serie){
        return serieRepo.save(serie);
    }

}
