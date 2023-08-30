package com.ata.entertainmentmedia.data.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "seasons", uniqueConstraints={@UniqueConstraint(columnNames={"season_id"})})
public class Season extends Media implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seasons_generator")
    @SequenceGenerator(name = "seasons_generator", sequenceName = "seasons_seq", allocationSize = 1)
    private Long id;

    private Integer episodeCount;


    private List<Episode> episodes;


    ////////// CONSTRUCTORS //////////


    public Season(Long id, LocalDate createdDate,
                  String name, Double rating, LocalDate publishedDate, Long thumbnailId, Long genreId,
                  Integer episodeCount, Long seasonId, Serie serie, List<Episode> episodes) {

        super(createdDate, name, rating, publishedDate, thumbnailId, genreId);
        this.episodeCount = episodeCount;
        this.episodes = episodes;
    }

    public Season() {

    }


    ///////////// OTHER ///////////////

    public Integer getEpisodeCount() {
        return episodeCount;
    }

    public void setEpisodeCount(Integer episodeCount) {
        this.episodeCount = episodeCount;
    }


    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }

}
