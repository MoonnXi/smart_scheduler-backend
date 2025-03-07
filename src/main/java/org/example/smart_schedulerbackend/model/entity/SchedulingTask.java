package org.example.smart_schedulerbackend.model.entity;

import lombok.Data;

@Data
public class SchedulingTask {
    private String yearSemester;
    private String courseNumber;
    private String courseName;
    private String teacherNumber;
    private String teacherName;
    private String classCompose;
    private String classId;
    private String courseDescription;
    private String credits;
    private String classroomName;
    private String hourType;
    private String commencementHour;
    private String schedulingHour;
    private String totalHour;
    private String schedulingPriority;
    private String classPeopleNumber;
    private String courseNature;
    private String classSchoolDistrict;
    private String externalType;
    private String classDepartmentName;
    private String classWeeksHours;
    private String rowsNumber;
    private String classroomTypeAssigned;
    private String classroomAssigned;
    private String departmentAssigned;
    private String timeAssigned;
}