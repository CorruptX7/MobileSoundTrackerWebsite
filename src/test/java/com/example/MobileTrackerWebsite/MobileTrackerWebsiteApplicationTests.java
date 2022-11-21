package com.example.MobileTrackerWebsite;

import com.example.MobileTrackerWebsite.model.sample.Sample;
import com.example.MobileTrackerWebsite.model.sample.SampleDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MobileTrackerWebsiteApplicationTests {

	@Autowired
	private SampleDao sampleDao;

	@Test
	void addSampleTest() {
		Sample sample = new Sample();

		sample.setSample("Sample 7");
		sample.setLongitude(34.322313342);
		sample.setLatitude(-11.3249284);
		sample.setDb("3.2");
		sampleDao.sendSample(sample);
	}

//	@Test
	void getAllSamplesTest() {
		List<Sample> samples = sampleDao.getAllSamples();
		System.out.println(samples);
	}

}
