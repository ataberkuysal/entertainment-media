package com.ata.entertainmentmedia.data.entities;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;



@MappedSuperclass
public abstract class BaseEntity {

    private LocalDate createdDate = LocalDate.now();

    ///////////// CONSTRUCTORS /////////////
    public BaseEntity(LocalDate createdDate) {

        this.createdDate = createdDate;
    }
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
