package com.intraduction.practiceweb.domain;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT_COURSE")
public class Student_Course {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Course course;
}
