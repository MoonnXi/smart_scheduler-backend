package org.example.smart_schedulerbackend.controller;

import org.example.smart_schedulerbackend.service.ProfessionalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ProfessionalDataController {
    @Autowired
    private ProfessionalDataService professionalDataService;

    @PostMapping("/getallprofessionaldata")
    public List<Map<String,Object>> getallprofessionaldata()
    {
        return professionalDataService.getAllProfessionalData();
    }
}
