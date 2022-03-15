package com.intraduction.practiceweb.service;

import com.intraduction.practiceweb.domain.Course;
import com.intraduction.practiceweb.repo.ICourseRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CourseService implements ICourseService{
    @Autowired
    private ICourseRep courseRep;
    @Override
    public Course createCourse(Course course) {
        try {
            return courseRep.save(course);

        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Iterable<Course> findAllCourse() {
        return courseRep.findAll();
    }

    @Override
    public void removeCourse(Integer courseId) {
        try {
            courseRep.deleteById(courseId);

        }catch (Exception ex){
            throw new RuntimeException(ex);
        }

    }
}
