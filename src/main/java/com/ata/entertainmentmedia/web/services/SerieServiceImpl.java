package com.ata.entertainmentmedia.web.services;

import com.ata.entertainmentmedia.data.entities.Serie;
import com.ata.entertainmentmedia.data.repos.SerieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieServiceImpl implements SerieService {

    @Autowired
    SerieRepo serieRepo;

    @Override
    public List<Serie> getAllSeries(){
        return serieRepo.findAll();
    }


    @Override
    public Serie getSerieById(Long id){
        return serieRepo.findById(id).orElseThrow();
    }

    @Override
    public Serie saveSerie(Serie serie){
        return serieRepo.save(serie);
    }

}
