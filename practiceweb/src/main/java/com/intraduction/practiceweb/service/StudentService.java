package com.intraduction.practiceweb.service;

import com.intraduction.practiceweb.domain.Student;
import com.intraduction.practiceweb.repo.IStudentRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentService implements IStudentService{
    @Autowired
    private IStudentRep studentRep;
    @Override
    public Student createStudent(Student student) {
        try {
            return studentRep.save(student);

        }catch (Exception ex){
            throw new RuntimeException( ex);
        }
    }

    @Override
    public Iterable<Student> findAllStudent() {
        return studentRep.findAll();
    }

    @Override
    public void removeStudent(Long studentId) {
        try {
            studentRep.deleteById(studentId);

        }catch (Exception ex){
            throw new RuntimeException(ex);
        }

    }
}
