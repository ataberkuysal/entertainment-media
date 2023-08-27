package com.ata.entertainmentmedia.data.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;


@Entity
@Table(name = "movies")
public class Movie extends Media{


    private Integer length;



    ///////////// CONSTRUCTORS //////////////


    public Movie(Long id, LocalDate createdDate, String name, Double rating, LocalDate publishedDate, Long thumbnailId, Long genreId, Integer length) {
        super(id, createdDate, name, rating, publishedDate, thumbnailId, genreId);
        this.length = length;
    }

    public Movie(String name, Double rating, LocalDate publishedDate, Long thumbnailId, Long genreId, Integer length) {
        super(name, rating, publishedDate, thumbnailId, genreId);
        this.length = length;
    }

    public Movie() {

    }


    ///////////// OTHER //////////////



    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}
