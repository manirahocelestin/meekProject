package com.intraduction.practiceweb.domain;

import com.fasterxml.jackson.databind.DatabindException;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rollNumber;
    @Column(name = "FName")
    private String firstName;
    @Column(name = "LName")
    private String lastName;
    @Column(name = "DOB")
    private Date dateOfBirthDay;
    private SGender gender;
}
