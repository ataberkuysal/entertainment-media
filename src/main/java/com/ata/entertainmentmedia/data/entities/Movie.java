package com.ata.entertainmentmedia.data.entities;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "movies")
//@AttributeOverride(name = "id", column = @Column(name = "movie_id"))
// ^? -> IN ORDER TO RELATE TO A COLUMN NAMED movie_id INSTEAD IF id
//IT STILL RETURNS id AS THE JSON KEY not movie_id -> (id : 4)
//THIS COULD BE DONE WITH JUST THE @COLUMN PROPERTY ON BASE CLASS(IS THERE A DIFFERENCE OTHER THAN THE LEVEL IT'S DONE)
public class Movie extends Media{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movies_generator")
    @SequenceGenerator(name = "movies_generator", sequenceName = "movies_seq", allocationSize = 1)
    private Long id;

    private Integer length;



    ///////////// CONSTRUCTORS //////////////


    public Movie(Long id, LocalDate createdDate,
                 String name, Double rating, LocalDate publishedDate, Long thumbnailId, Long genreId,
                 Long id1, Integer length) {

        super(createdDate, name, rating, publishedDate, thumbnailId, genreId);
        this.id = id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
