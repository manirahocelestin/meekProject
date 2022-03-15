package com.intraduction.practiceweb.domain;

import javax.persistence.*;

@Entity
@Table(name = "LAPTOP")
public class LapTop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int code;
    private String name;
}
