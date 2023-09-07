package com.ata.entertainmentmedia.data.DTOs;

import com.ata.entertainmentmedia.data.entities.Episode;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class SeasonDTOwithSerieId {

    private LocalDate createdDate;

    private String name;
    private Double rating;
    private LocalDate publishedDate;
    private Long thumbnailId;
    private Long genreId;

    private Long  seasonId;
    private Integer episodeCount;
    private Long serieId;
    private List<Episode> episodes;
}
