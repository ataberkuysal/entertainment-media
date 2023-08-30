package com.ata.entertainmentmedia.data.repos;

import com.ata.entertainmentmedia.data.entities.Episode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodeRepo extends JpaRepository<Episode, Long> {
}
