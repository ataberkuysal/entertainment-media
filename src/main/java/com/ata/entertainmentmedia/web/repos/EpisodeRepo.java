package com.ata.entertainmentmedia.web.repos;

import com.ata.entertainmentmedia.data.entities.Episode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodeRepo extends JpaRepository<Episode, Long> {
}
