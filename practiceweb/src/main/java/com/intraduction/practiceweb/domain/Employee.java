package com.intraduction.practiceweb.domain;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String names;
    private String address;
    @OneToOne
    private LapTop lapTop;
}
