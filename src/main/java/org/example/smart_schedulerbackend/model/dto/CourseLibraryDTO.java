package org.example.smart_schedulerbackend.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CourseLibraryDTO {
    @JsonProperty("course_number")
    private String courseNumber; // 课程编号

    @JsonProperty("course_name")
    private String courseName;   // 课程名称

    @JsonProperty("course_categories")
    private String courseCategories; // 课程类别

    @JsonProperty("course_type")
    private String courseType;   // 课程类型

    @JsonProperty("department")
    private String department;   // 开课部门

    @JsonProperty("enabled_status")
    private String enabledStatus; // 启用状态

    @JsonProperty("credits")
    private String credits;      // 学分

    @JsonProperty("weekly_hours")
    private String weeklyHours;  // 周学时

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
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

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
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
}
