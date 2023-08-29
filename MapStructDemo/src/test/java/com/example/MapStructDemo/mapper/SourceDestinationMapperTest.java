package com.example.MapStructDemo.mapper;

import com.example.MapStructDemo.model.Destination;
import com.example.MapStructDemo.model.Source;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SourceDestinationMapperTest {
    @Test
    public void givenSourceToDestination_whenMaps_thenCorrect() {
        Source source = new Source();
        source.setName("SourceName");
        source.setDescription("SourceDescription");

        Destination destination = SourceDestinationMapper.INSTANCE.sourceToDestination(source);

        assertEquals(source.getName(), destination.getName());
        assertEquals(source.getDescription(), destination.getDescription());
    }

    @Test
    public void givenDestinationToSource_whenMaps_thenCorrect() {
        Destination destination = new Destination();
        destination.setName("DestinationName");
        destination.setDescription("DestinationDescription");

        Source source = SourceDestinationMapper.INSTANCE.destinationToSource(destination);

        assertEquals(destination.getName(), source.getName());
        assertEquals(destination.getDescription(), source.getDescription());
    }
}

