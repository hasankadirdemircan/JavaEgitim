package com.school.management.model;

import com.school.management.enums.Gender;
import jakarta.persistence.*;
import lombok.*;



@Getter //lombok
@Setter //lombok
@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "student_no")
    private Long studentNo;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "is_active")
    private boolean isActive;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender") //tablodaki isimle aynı oldugu icin koymak zorunda degilsin.
    private Gender gender;
}
