package org.example.smart_schedulerbackend.service;
import org.example.smart_schedulerbackend.model.entity.SchedulingTask;

import java.util.List;

public interface CourseListGetService {
    List<SchedulingTask> getcourselist(String classSchoolDistrict, String classroomname);
}
