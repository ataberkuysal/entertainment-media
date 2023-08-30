package com.ata.entertainmentmedia.data.repos;

import com.ata.entertainmentmedia.data.entities.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepo extends JpaRepository<Serie, Long> {
}
