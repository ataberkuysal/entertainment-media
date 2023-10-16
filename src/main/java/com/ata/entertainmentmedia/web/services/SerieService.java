package com.ata.entertainmentmedia.web.services;

import com.ata.entertainmentmedia.data.dtos.SerieDTO;
import com.ata.entertainmentmedia.data.entities.Serie;

import java.util.List;

public interface SerieService {

    List<Serie> getAllSeries();

    Serie getSerieById(Long id);

    Serie saveSerie(Serie serie);

    Serie updateSerie(SerieDTO serieDTO, Long id);
}
