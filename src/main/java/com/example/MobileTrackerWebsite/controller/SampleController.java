package com.example.MobileTrackerWebsite.controller;

import com.example.MobileTrackerWebsite.model.sample.Sample;
import com.example.MobileTrackerWebsite.model.sample.SampleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

// Source: https://youtu.be/8P3lglutFTY

@RestController
public class SampleController {

    // Inject Dao object into controller class
    @Autowired
    private SampleDao sampleDao;

    // Use Postman API Platform to test
    // @GetMapping Shortcut for @RequestMapping(method = RequestMethod. GET)
    @GetMapping("/sample/get-request")
    public List<Sample> getAllSamples() {
        return sampleDao.getAllSamples();
    }

    // Should be different to be initial URL because /sample/get-request is already being used
    // Use Postman to get test once again
    // Save data in a JSON format

    // e.g. {
    //    "sample": "Sample 1",
    //    "longitude": "-2.213123123",
    //    "latitude": "1.234243665",
    //    "db": "1.4"
    //}

    // Post request and save it to the MySQL DB

    // Return also returns the response after the request has been sent
    @PostMapping("/sample/post-request")
    public Sample postSample(@RequestBody Sample sample) {
        return sampleDao.sendSample(sample);
    }

//    @RequestMapping("/sample/index")
//    public ModelAndView index() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("index.html");
//        return modelAndView;
//    }

}
