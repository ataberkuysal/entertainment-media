package com.ata.entertainmentmedia.data.dtos;

import com.ata.entertainmentmedia.data.entities.Season;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EpisodeDTO {

    private Long episodeId;

    private LocalDate createdDate;

    private String name;
    private Double rating;
    private LocalDate publishedDate;
    private Long thumbnailId;
    private Long genreId;

    private Integer length;
    //
    private Season season;
    private Long seasonId;

}
