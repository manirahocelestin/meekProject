package com.intraduction.practiceweb.repo;

import com.intraduction.practiceweb.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRep extends JpaRepository<Course,Integer> {
}
