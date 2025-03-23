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

    public String getClassroomNumber() {
        return classroomNumber;
    }

    public void setClassroomNumber(String classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public String getSchoolDistricts() {
        return schoolDistricts;
    }

    public void setSchoolDistricts(String schoolDistricts) {
        this.schoolDistricts = schoolDistricts;
    }

    public String getSchoolBuilding() {
        return schoolBuilding;
    }

    public void setSchoolBuilding(String schoolBuilding) {
        this.schoolBuilding = schoolBuilding;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getClassroomLabels() {
        return classroomLabels;
    }

    public void setClassroomLabels(String classroomLabels) {
        this.classroomLabels = classroomLabels;
    }

    public String getClassroomType() {
        return classroomType;
    }

    public void setClassroomType(String classroomType) {
        this.classroomType = classroomType;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(String maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public String getAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(String airConditioning) {
        this.airConditioning = airConditioning;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getClassroomDescription() {
        return classroomDescription;
    }

    public void setClassroomDescription(String classroomDescription) {
        this.classroomDescription = classroomDescription;
    }

    public String getManagementDepartment() {
        return managementDepartment;
    }

    public void setManagementDepartment(String managementDepartment) {
        this.managementDepartment = managementDepartment;
    }

    public String getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours(String weeklyHours) {
        this.weeklyHours = weeklyHours;
    }

    public String getClassroomSize() {
        return classroomSize;
    }

    public void setClassroomSize(String classroomSize) {
        this.classroomSize = classroomSize;
    }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }
}