package com.ata.entertainmentmedia.data.repos;

import com.ata.entertainmentmedia.data.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Long> {
}
