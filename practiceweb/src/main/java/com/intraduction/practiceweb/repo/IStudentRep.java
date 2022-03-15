package com.intraduction.practiceweb.repo;

import com.intraduction.practiceweb.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRep extends JpaRepository<Student,Long> {
}
