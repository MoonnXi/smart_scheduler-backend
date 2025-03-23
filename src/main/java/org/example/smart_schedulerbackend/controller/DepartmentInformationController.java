package org.example.smart_schedulerbackend.controller;

import org.example.smart_schedulerbackend.model.entity.DepartmentInformation;
import org.example.smart_schedulerbackend.service.DepartmentInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class DepartmentInformationController {
    @Autowired
    private DepartmentInformationService departmentInformationService;

    @PostMapping("/getalldepartmentinformation")
    public List<Map<String,Object>> getalldepartmentinformation(@RequestParam int page, @RequestParam int size)
    {
        return departmentInformationService.getAllDepartmentInformation(page,size);
    }

    @PostMapping("/countdepartmentinformation")
    public Map<String,Object> countdepartmentinformation()
    {
        return departmentInformationService.countDepartmentInformation();
    }
}
