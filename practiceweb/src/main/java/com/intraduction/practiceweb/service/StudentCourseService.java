package com.intraduction.practiceweb.service;

import com.intraduction.practiceweb.domain.Student_Course;
import com.intraduction.practiceweb.repo.IStudentCourseRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentCourseService implements IStudentCourseService{
    @Autowired
    private IStudentCourseRep studentCourseRep;
    @Override
    public Student_Course createStudentCourse(Student_Course studentCourse) {
        try {
            return studentCourseRep.save(studentCourse);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterable<Student_Course> findAllStudentCourse() {
        return studentCourseRep.findAll();
    }

    @Override
    public void removeStudentCourse(Integer studCouId) {
        try {
            studentCourseRep.deleteById(studCouId);

        }catch (Exception ex){
            throw new RuntimeException(ex);
        }

    }
}
