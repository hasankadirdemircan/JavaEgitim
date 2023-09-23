package com.bilgeadam.springdata;

import com.bilgeadam.springdata.model.Student;
import com.bilgeadam.springdata.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdataApplication implements CommandLineRunner {

	private final StudentRepository studentRepository;

	public SpringdataApplication(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringdataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("HELLO");
		/*studentRepository.findStudentsByName("hasan");
		studentRepository.findStudentsByIsActive(true);
		System.out.println("HELLOOO");
		studentRepository.findAll();
		studentRepository.findById(5L);
		studentRepository.deleteById(5L);
		Student student = new Student(6L,"hasan", "demircan", 28, false);
		studentRepository.save(student);
		//studentRepository.find*/
	}
}
