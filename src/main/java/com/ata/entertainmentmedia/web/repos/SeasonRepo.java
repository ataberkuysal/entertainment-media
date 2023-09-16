package com.ata.entertainmentmedia.web.repos;

import com.ata.entertainmentmedia.data.entities.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeasonRepo extends JpaRepository<Season, Long> {
}
