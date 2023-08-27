package com.ata.entertainmentmedia.data.repos;

import com.ata.entertainmentmedia.data.entities.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseEntityRepo extends JpaRepository<BaseEntity, Long> {
}
