package com.school.management.repository;

import com.school.management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByFirstName(String firstName);

    @Query("SELECT s FROM Student s WHERE s.firstName = :firstName")
    Optional<Student> findByFirstNameJPQL(@Param("firstName") String firstName);

    @Query(value = "SELECT * FROM student s WHERE s.first_name = :firstName", nativeQuery = true)
    Optional<Student> findByFirstNameNative(@Param("firstName") String firstName);

}
