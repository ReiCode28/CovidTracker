package io.reicode.coronavirustracker.controllers;

import io.reicode.coronavirustracker.CoronavirusTrackerApplication;
import io.reicode.coronavirustracker.services.CovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    CovidDataService covidDataService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("locationStats", covidDataService.getAllStats());
        return "home";
    }
}