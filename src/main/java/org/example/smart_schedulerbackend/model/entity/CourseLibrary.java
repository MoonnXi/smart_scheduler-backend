package org.example.smart_schedulerbackend.model.entity;

import lombok.Data;

@Data
public class CourseLibrary {
    private String coursenumber;
    private String courseName;
    private String courseCategories;
    private String courseProperties;
    private String courseType;
    private String courseNature;
    private String englishName;
    private String department;
    private String enabledStatus;
    private String creditHours;
    private String theoreticalHours;
    private String experimentalHours;
    private String computerBasedHours;
    private String practicalHours;
    private String otherHours;
    private String credits;
    private String weeklyHours;
    private String purelyPractical;

    public void setCourseNumber(String courseNumber) {
        this.coursenumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCategories() {
        return courseCategories;
    }

    public void setCourseCategories(String courseCategories) {
        this.courseCategories = courseCategories;
    }

    public String getCourseProperties() {
        return courseProperties;
    }

    public void setCourseProperties(String courseProperties) {
        this.courseProperties = courseProperties;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseNature() {
        return courseNature;
    }

    public void setCourseNature(String courseNature) {
        this.courseNature = courseNature;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEnabledStatus() {
        return enabledStatus;
    }

    public void setEnabledStatus(String enabledStatus) {
        this.enabledStatus = enabledStatus;
    }

    public String getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(String creditHours) {
        this.creditHours = creditHours;
    }

    public String getTheoreticalHours() {
        return theoreticalHours;
    }

    public void setTheoreticalHours(String theoreticalHours) {
        this.theoreticalHours = theoreticalHours;
    }

    public String getExperimentalHours() {
        return experimentalHours;
    }

    public void setExperimentalHours(String experimentalHours) {
        this.experimentalHours = experimentalHours;
    }

    public String getComputerBasedHours() {
        return computerBasedHours;
    }

    public void setComputerBasedHours(String computerBasedHours) {
        this.computerBasedHours = computerBasedHours;
    }

    public String getPracticalHours() {
        return practicalHours;
    }

    public void setPracticalHours(String practicalHours) {
        this.practicalHours = practicalHours;
    }

    public String getOtherHours() {
        return otherHours;
    }

    public void setOtherHours(String otherHours) {
        this.otherHours = otherHours;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours(String weeklyHours) {
        this.weeklyHours = weeklyHours;
    }

    public String getPurelyPractical() {
        return purelyPractical;
    }

    public void setPurelyPractical(String purelyPractical) {
        this.purelyPractical = purelyPractical;
    }


    public String getCourseNumber() {
        return coursenumber;
    }
}