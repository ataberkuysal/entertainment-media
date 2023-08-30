package com.ata.entertainmentmedia.data.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "series", uniqueConstraints={@UniqueConstraint(columnNames={"serie_id"})})
public class Serie extends Media implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "series_generator")
    @SequenceGenerator(name = "series_generator", sequenceName = "series_seq", allocationSize = 1)
    private Long id;

    private Integer seasonCount;

    @OneToMany(mappedBy = "serie", cascade = CascadeType.ALL, orphanRemoval = true)
    //@JsonIgnore
    //@ToString.Exclude
    //@Column(name = "seasons")
    private List<Season> seasons;

    @Column(name = "total_episode_count")
    private Integer totalEpisodeCount;


    ///////// CONSTRUCTORS //////////


    public Serie(LocalDate createdDate,
                 String name, Double rating, LocalDate publishedDate, Long thumbnailId, Long genreId,
                 Long serieId, Long id, Integer seasonCount, List<Season> seasons, Integer totalEpisodeCount) {

        super(createdDate, name, rating, publishedDate, thumbnailId, genreId);
        this.id = id;


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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
