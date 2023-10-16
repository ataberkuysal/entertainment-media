package com.ata.entertainmentmedia.data.entities;

import jakarta.persistence.MappedSuperclass;

import java.time.LocalDate;



@MappedSuperclass
public abstract class BaseEntity {

    private LocalDate createdDate = LocalDate.now();

    ///////////// CONSTRUCTORS /////////////
    public BaseEntity() {

    }

    ///////////// OTHER ///////////////


    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
}
