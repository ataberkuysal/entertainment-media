package com.ata.entertainmentmedia.data.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "series")
public class Serie extends Media implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "series_generator")
    @SequenceGenerator(name = "series_generator", sequenceName = "series_seq", allocationSize = 1)
    @Column(name = "serie_id")
    private Long serieId;

    private Integer seasonCount;

    /////////////////

    @OneToMany(mappedBy ="serie",cascade = CascadeType.ALL, orphanRemoval = true)
    //@JoinColumn(name = "serie_id")
    //@JsonManagedReference
    private List<Season> seasons;


    //////////////////////

    @Column(name = "total_episode_count")
    private Integer totalEpisodeCount;


    ///////// CONSTRUCTORS //////////


    public Serie(String name, Double rating, LocalDate publishedDate, Long thumbnailId, Long genreId,
                  Long serieId, Integer seasonCount, List<Season> seasons, Integer totalEpisodeCount) {

        super (name, rating, publishedDate, thumbnailId, genreId);
        this.serieId = serieId;


        this.seasonCount = seasonCount;
        this.seasons = seasons;
        this.totalEpisodeCount = totalEpisodeCount;
    }

    public Serie() {

    }

    ////////// OTHER /////////////////



    public Integer getSeason_count() {
        return seasonCount;
    }

    public void setSeason_count(Integer seasonCount) {
        this.seasonCount = seasonCount;
    }

    public Integer getTotalEpisodeCount() {
        return totalEpisodeCount;
    }

    public void setTotalEpisodeCount(Integer totalEpisodeCount) {
        this.totalEpisodeCount = totalEpisodeCount;
    }

    public List<Season> getSeason() {
        return seasons;
    }

    public void setSeason(List<Season> seasons) {
        this.seasons = seasons;
    }

    ////
    public void addSeason(Season season) {
        seasons.add(season);
    }

    public void removeSeason(Season season) {
        seasons.remove(season);
    }

    ////


    public Long getId() {
        return serieId;
    }

}
