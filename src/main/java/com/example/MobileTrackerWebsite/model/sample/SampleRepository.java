package com.example.MobileTrackerWebsite.model.sample;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// CRUD Repository
@Repository
public interface SampleRepository extends CrudRepository<Sample, Integer> {
}
