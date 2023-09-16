package com.ata.entertainmentmedia.data.dtos;

import com.ata.entertainmentmedia.data.entities.Season;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class SerieDTO {

    private Long serieId;

    private LocalDate createdDate;

    private String name;
    private Double rating;
    private LocalDate publishedDate;
    private Long thumbnailId;
    private Long genreId;

    private Integer seasonCount;
    private List<Season> seasons;
    private Integer totalEpisodeCount;

}
