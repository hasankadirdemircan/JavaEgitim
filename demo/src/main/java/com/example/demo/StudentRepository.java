package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s WHERE s.isActive = true") //JPQL
    List<Student> activeStudents();

    @Query(value = "SELECT * FROM Students s WHERE s.is_active = true", nativeQuery = true) //Native SQL
    List<Student> activeStudentsNativeSQL();
}
