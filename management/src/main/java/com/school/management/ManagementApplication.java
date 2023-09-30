package com.school.management;

import com.school.management.enums.Gender;
import com.school.management.enums.LessonEnum;
import com.school.management.model.Lesson;
import com.school.management.model.LessonDetail;
import com.school.management.model.Student;
import com.school.management.repository.LessonDetailRepository;
import com.school.management.repository.LessonRepository;
import com.school.management.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@SpringBootApplication
@RequiredArgsConstructor
public class ManagementApplication implements CommandLineRunner {
	private final StudentRepository studentRepository;
	private final LessonRepository lessonRepository;
	private final LessonDetailRepository lessonDetailRepository;

	/*public ManagementApplication(StudentRepository studentRepository, LessonRepository lessonRepository, LessonDetailRepository lessonDetailRepository) {
		this.studentRepository = studentRepository;
		this.lessonRepository = lessonRepository;
		this.lessonDetailRepository = lessonDetailRepository;
	}*/

	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
	}

	@Override
	public void run(String... args) {
		studentRepository.studentsOfLessonByLessonIdAndIsActive(3L, false);
	}

	private void findStudentsOfLessonByLessonName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dersler");
		String lessonName = scanner.next();
		LessonEnum selectedLesson = LessonEnum.valueOf(lessonName);
		Long lessonId =  lessonRepository.findByLessonName(selectedLesson)
				.orElseThrow(() -> new RuntimeException("no lesson")).getId();
		/*List<LessonDetail> lessonDetails = lessonDetailRepository.findByLessonId(lessonId);
		List<Long> studentNoList = lessonDetails.stream().map(LessonDetail::getStudentNo).toList();*/
		List<Long> studentNoList = lessonDetailRepository.findByLessonIdListJPQL(lessonId);
		studentRepository.findAllById(studentNoList);
	}

	private void addALessonToStudent() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Öğrencilerimiz ve Derslerimiz");
		List<Student> studentList = studentRepository.findAll();
		System.out.println("-----------------Öğrenci Listesi---------------");
		System.out.println("");
		System.out.println("--Name--                          --ActiveStudent?--");
		for(Student student : studentList) {
			System.out.println();
			System.out.print(student.getFirstName());
			System.out.print("                                  ");
			System.out.print(student.isActive());
		}
		System.out.println("");

		List<Lesson> lessonList = lessonRepository.findAll();
		System.out.println("-----------------Ders Listesi---------------");
		System.out.println("");
		System.out.println("--Name--                          --PassedNote--");
		for(Lesson lesson : lessonList) {
			System.out.println();
			System.out.print(lesson.getLessonName());
			System.out.print("                                  ");
			System.out.print(lesson.getPassedNote());
		}
		System.out.println("");

		System.out.println("Öğrenci Adı Giriniz:");
		String studentName = scanner.next();
		System.out.println("Atanacak Ders Adı Girinz");
		String lessonName = scanner.next();
		System.out.println();
		Long studentNo = studentRepository.findByFirstName(studentName)
				.orElseThrow(()-> new RuntimeException("no student"))
				.getStudentNo();
		LessonEnum lessonEnum = LessonEnum.valueOf(lessonName);
		Long lessonId = lessonRepository.findByLessonName(lessonEnum)
				.orElseThrow(() -> new RuntimeException("no lesson")).getId();

		LessonDetail lessonDetail = new LessonDetail();
		lessonDetail.setLessonId(lessonId);
		lessonDetail.setStudentNo(studentNo);
		//lessonDetailRepository.save(lessonDetail);

	}

	public void insertScript() {
		Student student1 = new Student();
		student1.setStudentNo(1L);
		student1.setFirstName("hasan");
		student1.setLastName("demircan");
		student1.setGender(Gender.MALE);
		student1.setActive(true);

		Student student2 = new Student();
		student2.setStudentNo(2L);
		student2.setFirstName("ayse");
		student2.setLastName("a");
		student2.setGender(Gender.FEMALE);
		student2.setActive(false);

		Student student3 = new Student();
		student3.setStudentNo(3L);
		student3.setFirstName("mehmet");
		student3.setLastName("m");
		student3.setGender(Gender.MALE);
		student3.setActive(true);

		Student student4 = new Student();
		student4.setStudentNo(4L);
		student4.setFirstName("fatma");
		student4.setLastName("f");
		student4.setGender(Gender.FEMALE);
		student4.setActive(true);

		Lesson lesson1 = new Lesson();
		lesson1.setId(1L);
		lesson1.setLessonName(LessonEnum.MATH);
		lesson1.setPassedNote(68);

		Lesson lesson2 = new Lesson();
		lesson2.setId(2L);
		lesson2.setLessonName(LessonEnum.BIOLOGY);
		lesson2.setPassedNote(60);

		Lesson lesson3 = new Lesson();
		lesson3.setId(3L);
		lesson3.setLessonName(LessonEnum.CHEMISTRY);
		lesson3.setPassedNote(50);

		Lesson lesson4 = new Lesson();
		lesson4.setId(4L);
		lesson4.setLessonName(LessonEnum.MUSIC);
		lesson4.setPassedNote(40);

		LessonDetail lessonDetail1 = new LessonDetail();
		lessonDetail1.setStudentNo(4L);
		lessonDetail1.setLessonId(2L);
		lessonDetail1.setStudentNote(60);

		LessonDetail lessonDetail2 = new LessonDetail();
		lessonDetail2.setStudentNo(4L);
		lessonDetail2.setLessonId(3L);
		lessonDetail2.setStudentNote(70);

		LessonDetail lessonDetail3 = new LessonDetail();
		lessonDetail3.setStudentNo(1L);
		lessonDetail3.setLessonId(2L);
		lessonDetail3.setStudentNote(65);

		LessonDetail lessonDetail4 = new LessonDetail();
		lessonDetail4.setStudentNo(2L);
		lessonDetail4.setLessonId(3L);
		lessonDetail4.setStudentNote(45);

		LessonDetail lessonDetail5 = new LessonDetail();
		lessonDetail5.setStudentNo(3L);
		lessonDetail5.setLessonId(1L);
		lessonDetail5.setStudentNote(85);


		studentRepository.save(student1);
		studentRepository.save(student2);
		studentRepository.save(student3);
		studentRepository.save(student4);

		lessonRepository.save(lesson1);
		lessonRepository.save(lesson2);
		lessonRepository.save(lesson3);
		lessonRepository.save(lesson4);

		lessonDetailRepository.save(lessonDetail1);
		lessonDetailRepository.save(lessonDetail2);
		lessonDetailRepository.save(lessonDetail3);
		lessonDetailRepository.save(lessonDetail4);
		lessonDetailRepository.save(lessonDetail5);
	}
}
