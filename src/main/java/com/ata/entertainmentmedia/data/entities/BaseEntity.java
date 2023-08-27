package com.ata.entertainmentmedia.data.entities;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;



@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movies_generator")
    @SequenceGenerator(name = "movies_generator", sequenceName = "movies_seq", allocationSize = 1)
    private Long id;

    private LocalDate createdDate = LocalDate.now();

    ///////////// CONSTRUCTORS /////////////
    public BaseEntity(Long id, LocalDate createdDate) {
        this.id = id;
        this.createdDate = createdDate;
    }
    public BaseEntity() {

    }

    ///////////// OTHER ///////////////


    public Long getId() {
        return id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
}
