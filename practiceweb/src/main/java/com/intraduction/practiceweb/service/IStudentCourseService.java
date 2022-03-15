package com.intraduction.practiceweb.service;

import com.intraduction.practiceweb.domain.Student_Course;

public interface IStudentCourseService {
    Student_Course createStudentCourse(Student_Course studentCourse);

    Iterable<Student_Course> findAllStudentCourse();

    void removeStudentCourse(Integer studCouId);
}
