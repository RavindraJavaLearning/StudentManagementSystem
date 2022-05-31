package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository StudentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Ravindra", "Patil", "ravindra@gmail.com");
//		StudentRepository.save(student1);
//		
//		student1 = new Student("Sanjay", "Patil", "sanjay@gmail.com");
//		StudentRepository.save(student1);
//		
//		student1 = new Student("Ramesh", "Patil", "ramesh@gmail.com");
//		StudentRepository.save(student1);
		
	}

}