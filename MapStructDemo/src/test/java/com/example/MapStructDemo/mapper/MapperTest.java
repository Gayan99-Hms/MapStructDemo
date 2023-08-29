package com.example.MapStructDemo.mapper;

import com.example.MapStructDemo.model.Destination;
import com.example.MapStructDemo.model.Source;

public class MapperTest {
    public static void main(String[] args) {
        Source source = new Source();
        source.setName("Source Name");
        source.setDescription("Source Description");

        Destination destination = SourceDestinationMapper.INSTANCE.sourceToDestination(source);

        System.out.println("Source: " + source.getName() + " | " + source.getDescription());
        System.out.println("Destination: " + destination.getName() + " | " + destination.getDescription());


        Source convertedSource = SourceDestinationMapper.INSTANCE.destinationToSource(destination);

        System.out.println("Converted Source: " + convertedSource.getName() + " | " + convertedSource.getDescription());
    }
}
