package com.example.MobileTrackerWebsite.controller;

import com.example.MobileTrackerWebsite.model.sample.Sample;
import com.example.MobileTrackerWebsite.model.sample.SampleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MobileTrackerController {

    @Autowired
    public SampleDao sampleDao;

    @RequestMapping("/sample/index")
    public String getAllSamples(Model model) {
        List<Sample> samples = sampleDao.getAllSamples();
        model.addAttribute("samples", samples);
        return "/index";
    }

}
