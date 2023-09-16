package com.ata.entertainmentmedia.web.repos;

import com.ata.entertainmentmedia.data.entities.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepo extends JpaRepository<Serie, Long> {
}
