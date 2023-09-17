package com.ata.entertainmentmedia.utils.mappers;

import com.ata.entertainmentmedia.data.dtos.EpisodeDTO;
import com.ata.entertainmentmedia.data.entities.Episode;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface UpdateEpisodeMapper {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEpisodeFromDTO(EpisodeDTO episodeDTO, @MappingTarget Episode episode);
}
