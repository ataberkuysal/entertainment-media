package com.ata.entertainmentmedia.web.services;

import com.ata.entertainmentmedia.data.dtos.SerieDTO;
import com.ata.entertainmentmedia.data.entities.Serie;
import com.ata.entertainmentmedia.utils.mappers.UpdateSerieMapper;
import com.ata.entertainmentmedia.web.repos.SerieRepo;
import com.ata.entertainmentmedia.web.exceptions.custom_exceptions.NoSuchSerieIdException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieServiceImpl implements SerieService {

    @Autowired
    SerieRepo serieRepo;

    @Autowired
    UpdateSerieMapper updateSerieMapper;

    @Override
    public List<Serie> getAllSeries(){
        return serieRepo.findAll();
    }


    @Override
    public Serie getSerieById(Long id){
        return serieRepo.findById(id).orElseThrow(() -> new NoSuchSerieIdException("Given serieId is not present in series"));
    }

    @Override
    public Serie saveSerie(Serie serie){
        return serieRepo.save(serie);
    }

    @Override
    public Serie updateSerie(SerieDTO serieDTO, Long id) {
        Serie serieToBeUpdated = getSerieById(id);
        updateSerieMapper.updateSerieFromDTO(serieDTO, serieToBeUpdated);
        return serieRepo.save(serieToBeUpdated);
    }

}
