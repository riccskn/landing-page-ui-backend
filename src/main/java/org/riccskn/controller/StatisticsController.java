package org.riccskn.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/statistics")
public class StatisticsController {


    @GetMapping("/projects_completed")
    public int getCountProjectsCompleted() {
        return 350;
    }

    @GetMapping("/professionals_teams")
    public int getCountProfessionalsTeams() {
        return 23;
    }

    @GetMapping("/years_experience")
    public int getCountYearsExperience() {
        return 15;
    }

}
