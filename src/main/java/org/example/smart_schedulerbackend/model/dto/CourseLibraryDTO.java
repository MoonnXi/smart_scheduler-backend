package org.example.smart_schedulerbackend.model.dto;

import lombok.Data;

@Data
public class CourseLibraryDTO {
    private String courseNumber; // 课程编号
    private String courseName;   // 课程名称
    private String courseCategories; // 课程类别
    private String courseType;   // 课程类型
    private String department;   // 开课部门
    private String enabledStatus; // 启用状态
    private String credits;      // 学分
    private String weeklyHours;  // 周学时

}
