package com.intraduction.practiceweb.service;

import com.intraduction.practiceweb.domain.Student;

public interface IStudentService {
    Student createStudent(Student student);

    Iterable<Student> findAllStudent();

    void removeStudent(Long studentId);
}
