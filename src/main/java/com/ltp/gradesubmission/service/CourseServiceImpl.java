package com.ltp.gradesubmission.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.ltp.gradesubmission.entity.Course;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service

public class CourseServiceImpl implements CourseService {

    @Override
    public Course getCourse(Long id) {
        return null;
    }

    @Override
    public Course saveCourse(Course course) {
        return null;
    }

    @Override
    public void deleteCourse(Long id) {
    }

    @Override
    public List<Course> getCourses() {
        return null;
    }

}
