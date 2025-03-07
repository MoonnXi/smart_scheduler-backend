package org.example.smart_schedulerbackend.model.entity;

import lombok.Data;

@Data
public class ClassroomInformation {
    private String classroomNumber;
    private String classroomName;
    private String schoolDistricts;
    private String schoolBuilding;
    private String floor;
    private String classroomLabels;
    private String classroomType;
    private String capacity;
    private String maximumCapacity;
    private String airConditioning;
    private String status; // 注意：原表中为Statu，这里修正为status以符合Java命名规范
    private String classroomDescription;
    private String managementDepartment;
    private String weeklyHours;
    private String classroomSize;
    private String tableType;
}