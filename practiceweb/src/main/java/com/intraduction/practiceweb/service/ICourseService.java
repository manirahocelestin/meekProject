package com.intraduction.practiceweb.service;

import com.intraduction.practiceweb.domain.Course;

public interface ICourseService {
    Course createCourse(Course course);

    Iterable<Course> findAllCourse();

    void removeCourse(Integer courseId);
}
