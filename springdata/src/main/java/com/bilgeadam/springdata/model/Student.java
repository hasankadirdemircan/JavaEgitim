package com.bilgeadam.springdata.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "students")
public class Student {
  /*  @Id
    @GeneratedValue(strategy = GenerationType.AUTO) -> 1 den başlayarak her kayıtta otomatik 1 arttırır id'yi.
    private Long id;*/

    public Student() {
    }

    public Student(Long studentNo, String name, String lastName, int age, boolean isActive) {
        this.studentNo = studentNo;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.isActive = isActive;
    }

    @Id
    @Column(name = "student_no")
    private Long studentNo;

   // @Column(name = "name")
    private String name;

    //@Size(min = 10, max = 50, message = "lastName must be between 10 and 50 characters")
    @Column(name = "last_name")
    private String lastName;

 //   @Column(name = "age")
    private int age;

    @Column(name = "is_active")
    private boolean isActive;


}
