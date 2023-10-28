package com.Spring.Practice;

import com.Spring.Practice.entity.Student;
import com.Spring.Practice.repository.StudentRepository;
import com.Spring.Practice.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootPracticeApplicationTests {
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private StudentService studentService;

	@Test
	void testCreateStudent() {
		Student student = new Student();

		student.setName("Kalana");
		student.setCourse("Engineering");
		student.setFee(300d);


		studentRepository.save(student);
	}

}
