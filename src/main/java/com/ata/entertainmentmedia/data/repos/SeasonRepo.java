package com.ata.entertainmentmedia.data.repos;

import com.ata.entertainmentmedia.data.entities.Season;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonRepo extends JpaRepository<Season, Long> {
}
