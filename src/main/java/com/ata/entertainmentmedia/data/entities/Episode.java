package com.ata.entertainmentmedia.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "episodes")
public class Episode extends Media{

    private Integer length;

    //////   CONSTRUCTORS /////////

    public Episode(Long id, LocalDate createdDate,
                   String name, Double rating, LocalDate publishedDate, Long thumbnailId, Long genreId,
                    Integer length) {

        super(id, createdDate, name, rating, publishedDate, thumbnailId, genreId);
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
}
