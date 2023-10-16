package com.ata.entertainmentmedia.data.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EpisodeDTOwithSeasonId {

    private Long episodeId;

    private LocalDate createdDate;

    private String name;
    private Double rating;
    private LocalDate publishedDate;
    private Long thumbnailId;
    private Long genreId;

    private Integer length;
    //private Season season;
    //
    private Long seasonId;
    //

}
