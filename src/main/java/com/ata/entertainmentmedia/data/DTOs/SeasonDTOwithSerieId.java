package com.ata.entertainmentmedia.data.dtos;

import com.ata.entertainmentmedia.data.entities.Episode;
import com.ata.entertainmentmedia.data.entities.Serie;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class SeasonDTOwithSerieId {

    private Long  seasonId;

    private LocalDate createdDate;

    private String name;
    private Double rating;
    private LocalDate publishedDate;
    private Long thumbnailId;
    private Long genreId;

    private Integer episodeCount;
    //private Serie serie;
    //
    private Long serieId;
    //
    private List<Episode> episodes;
}
