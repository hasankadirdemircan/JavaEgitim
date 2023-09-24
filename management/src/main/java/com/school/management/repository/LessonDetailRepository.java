package com.school.management.repository;

import com.school.management.model.LessonDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonDetailRepository extends JpaRepository<LessonDetail, Long> {
    List<LessonDetail> findByLessonId(Long lessonId);

    @Query("SELECT s.studentNo FROM LessonDetail s WHERE s.lessonId = :lessonId")
    List<Long> findByLessonIdListJPQL(@Param("lessonId") Long lessonId);

}
