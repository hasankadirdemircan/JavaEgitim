package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @Column(name = "student_no")
    private Long studentNo;

    @Column
    private String name;

    @Column(name="last_name")
    private String lastName;
    private int age;

    @Column(name = "is_active")
    private boolean isActive;
}
