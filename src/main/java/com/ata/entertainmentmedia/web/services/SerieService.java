package com.ata.entertainmentmedia.web.services;

import com.ata.entertainmentmedia.data.dtos.SerieDTO;
import com.ata.entertainmentmedia.data.entities.Serie;
import com.ata.entertainmentmedia.utils.logging.Log;

import java.util.List;

public interface SerieService {

    @Log
    List<Serie> getAllSeries();

    @Log
    Serie getSerieById(Long id);

    @Log
    Serie saveSerie(Serie serie);

    @Log
    Serie updateSerie(SerieDTO serieDTO, Long id);
}
