package com.ata.entertainmentmedia.data.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "episodes")
public class Episode extends Media implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "episodes_generator")
    @SequenceGenerator(name = "episodes_generator", sequenceName = "episodes_seq", allocationSize = 1)
    @Column(name = "episode_id")
    private Long episodeId;

    private Integer length;


    ///////////////////

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "season_id")
    @JsonBackReference
    //@JsonIgnore
    private Season season;


    //////   CONSTRUCTORS /////////


    public Episode(String name, Double rating, LocalDate publishedDate, Long thumbnailId, Long genreId,
                   Long episodeId, Integer length, Season season) {

        super(name, rating, publishedDate, thumbnailId, genreId);
        this.episodeId = episodeId;
        this.length = length;
        this.season = season;
    }

    public Episode() {

    }


    ////////////// OTHER //////////////

    public void setLength(Integer length) {

        this.length = length;
    }

    public Integer getLength() {

        return this.length;
    }

    public Long getId() {
        return episodeId;
    }


    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
