package com.ata.entertainmentmedia.data.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "seasons")
public class Season extends Media implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seasons_generator")
    @SequenceGenerator(name = "seasons_generator", sequenceName = "seasons_seq", allocationSize = 1)
    @Column(name = "season_id")
    private Long seasonId;

    private Integer episodeCount;

    ///////////////////

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "serie_id")
    @JsonBackReference
    //@JsonIgnore
    private Serie serie;

    @OneToMany(mappedBy = "season", cascade = CascadeType.ALL, orphanRemoval = true)
    //@JsonManagedReference
    private List<Episode> episodes;


    ////////// CONSTRUCTORS //////////


    public Season(String name, Double rating, LocalDate publishedDate, Long thumbnailId, Long genreId,
                  Integer episodeCount, Long seasonId, Serie serie, List<Episode> episodes) {

        super(name, rating, publishedDate, thumbnailId, genreId);
        this.episodeCount = episodeCount;
        this.seasonId = seasonId;
        this.serie = serie;
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

    ////
    public void addEpisode(Episode episode) {
        episodes.add(episode);
    }

    public void removeEpisode(Episode episode) {
        episodes.remove(episode);
    }

    ////

    public Long getId() {
        return seasonId;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

}
