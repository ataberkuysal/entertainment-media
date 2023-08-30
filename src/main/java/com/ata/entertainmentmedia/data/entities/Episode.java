package com.ata.entertainmentmedia.data.entities;

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
    private Long id;

    private Integer length;


    //////   CONSTRUCTORS /////////


    public Episode(Long id, LocalDate createdDate,
                   String name, Double rating, LocalDate publishedDate, Long thumbnailId, Long genreId,
                   Integer length) {

        super(createdDate, name, rating, publishedDate, thumbnailId, genreId);
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
