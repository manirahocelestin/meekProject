package com.intraduction.practiceweb.repo;

import com.intraduction.practiceweb.domain.Student_Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IStudentCourseRep extends JpaRepository<Student_Course,Integer> {
}
