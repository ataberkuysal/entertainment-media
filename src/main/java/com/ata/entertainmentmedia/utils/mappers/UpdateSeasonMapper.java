package com.ata.entertainmentmedia.utils.mappers;

import com.ata.entertainmentmedia.data.dtos.SeasonDTO;
import com.ata.entertainmentmedia.data.entities.Season;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface UpdateSeasonMapper {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateSeasonFromDTO(SeasonDTO seasonDTO, @MappingTarget Season season);
}

