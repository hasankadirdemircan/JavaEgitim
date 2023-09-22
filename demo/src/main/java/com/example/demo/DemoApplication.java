package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private final StudentRepository studentRepository;

	public DemoApplication(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		studentRepository.activeStudents();
		studentRepository.activeStudentsNativeSQL();
		findAllStudents();
		findStudentById(5L);
	}

	public void findAllStudents() {
		studentRepository.findAll();
	}

	public void findStudentById(Long studentId) {
		studentRepository.findById(studentId);
	}

	public void saveStudent(Student student) {
		studentRepository.save(student);
	}

	public void deleteStudent(Student student) {
		studentRepository.delete(student);
	}

	public void deleteStudentById(Long studentId) {
		studentRepository.deleteById(studentId);
	}

}
