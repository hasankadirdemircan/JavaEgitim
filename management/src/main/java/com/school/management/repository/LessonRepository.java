package com.school.management.repository;

import com.school.management.enums.LessonEnum;
import com.school.management.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {
    Optional<Lesson> findByLessonName(LessonEnum lessonName);
}
