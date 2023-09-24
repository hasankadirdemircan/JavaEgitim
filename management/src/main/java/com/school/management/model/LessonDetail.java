package com.school.management.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter //lombok
@Setter //lombok
@Entity
@Table(name = "lesson_detail")
public class LessonDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "lesson_id")
    private Long lessonId;

    @Column(name = "student_no")
    private Long studentNo;

    @Column(name = "student_note")
    private double studentNote;
}
