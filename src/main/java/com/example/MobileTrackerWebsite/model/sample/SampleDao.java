package com.example.MobileTrackerWebsite.model.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


// @Service - we'll be using this class in other classes
@Service
public class SampleDao {

    // @Autowired - Automatically get an object (Dependency injection) i.e. required details from another class
    @Autowired
    private SampleRepository repository;

    // Function for sending a sample and getting all the samples
    public Sample sendSample(Sample sample) {

        return repository.save(sample);
    }

    public List<Sample> getAllSamples() {

        List<Sample> samples = new ArrayList<>();

        Streamable.of(repository.findAll())
                .forEach(samples::add);

        return samples;
    }
}
