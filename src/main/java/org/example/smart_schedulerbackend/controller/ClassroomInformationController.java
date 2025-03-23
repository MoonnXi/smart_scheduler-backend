package org.example.smart_schedulerbackend.controller;

import org.example.smart_schedulerbackend.model.entity.ClassroomInformation;
import org.example.smart_schedulerbackend.service.impl.ClassroomInformationServiceImpl;
import org.example.smart_schedulerbackend.tools.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ClassroomInformationController {
    @Autowired
    private ClassroomInformationServiceImpl classroomInformationService;

    @PostMapping("/getallclassroominformation")
    public List<ClassroomInformation> getallclassroominformation(@RequestParam String schoolDistricts, @RequestParam String schoolBuilding, @RequestParam int page,
                                                                       @RequestParam int size)
    {
        return classroomInformationService.getAllClassroomInformation(schoolDistricts,schoolBuilding,page,size);
    }

    @PostMapping("/countclassroominformation")
    public Map<String,Object> countclassroominformation(@RequestParam String schoolDistricts, @RequestParam String schoolBuilding)
    {
        return classroomInformationService.countClassroomInformation(schoolDistricts,schoolBuilding);
    }
}
