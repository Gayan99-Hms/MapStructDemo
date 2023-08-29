package com.example.MapStructDemo.mapper;

import com.example.MapStructDemo.model.Destination;
import com.example.MapStructDemo.model.Source;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SourceDestinationMapper {
    SourceDestinationMapper INSTANCE = Mappers.getMapper(SourceDestinationMapper.class);

    Destination sourceToDestination(Source source);
    Source destinationToSource(Destination destination);
}
