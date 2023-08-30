package com.ata.entertainmentmedia.data.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "episodes")
public class Episode extends Media implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "episodes_generator")
    @SequenceGenerator(name = "episodes_generator", sequenceName = "episodes_seq", allocationSize = 1)
    private Long id;

    private Integer length;


    //////   CONSTRUCTORS /////////


    public Episode(LocalDate createdDate,
                   String name, Double rating, LocalDate publishedDate, Long thumbnailId, Long genreId,
                   Long id, Integer length) {

        super(createdDate, name, rating, publishedDate, thumbnailId, genreId);
        this.id = id;
        this.length = length;
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
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
