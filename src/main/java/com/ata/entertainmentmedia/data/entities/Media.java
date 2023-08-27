package com.ata.entertainmentmedia.data.entities;

import jakarta.persistence.MappedSuperclass;

import java.time.LocalDate;


@MappedSuperclass
public abstract class Media extends BaseEntity {


    private String name;

    private Double rating;

    private LocalDate publishedDate;

    private Long thumbnailId;

    private Long genreId;


    ////////// CONSTRUCTORS //////////////

    public Media(Long id, LocalDate createdDate, String name, Double rating, LocalDate publishedDate, Long thumbnailId, Long genreId) {
        super(id, createdDate);
        this.name = name;
        this.rating = rating;
        this.publishedDate = publishedDate;
        this.thumbnailId = thumbnailId;
        this.genreId = genreId;
    }

    public Media(String name, Double rating, LocalDate publishedDate, Long thumbnailId, Long genreId) {
        this.name = name;
        this.rating = rating;
        this.publishedDate = publishedDate;
        this.thumbnailId = thumbnailId;
        this.genreId = genreId;
    }

    public Media(){

    }

    ////////////// OTHER /////////////


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Long getThumbnailId() {
        return thumbnailId;
    }

    public void setThumbnailId(Long thumbnailId) {
        this.thumbnailId = thumbnailId;
    }

    public Long getGenreId() {
        return genreId;
    }

    public void setGenreId(Long genreId) {
        this.genreId = genreId;
    }
}
