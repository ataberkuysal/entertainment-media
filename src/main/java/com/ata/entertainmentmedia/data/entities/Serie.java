package com.ata.entertainmentmedia.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "series")
public class Serie extends Media{

    private List<Episode> episodes;

    private Integer season_count;

    private Integer episode_count;

    ///////// CONSTRUCTORS //////////


    public Serie(Long id, LocalDate createdDate,
                 String name, Double rating, LocalDate publishedDate, Long thumbnailId, Long genreId,
                 List<Episode> episodes, Integer season_count, Integer episode_count) {

        super(id, createdDate, name, rating, publishedDate, thumbnailId, genreId);
        this.episodes = episodes;
        this.season_count = season_count;
        this.episode_count = episode_count;
    }

    public Serie() {

    }

    ////////// OTHER /////////////////


    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }

    public Integer getSeason_count() {
        return season_count;
    }

    public void setSeason_count(Integer season_count) {
        this.season_count = season_count;
    }

    public Integer getEpisode_count() {
        return episode_count;
    }

    public void setEpisode_count(Integer episode_count) {
        this.episode_count = episode_count;
    }
}
