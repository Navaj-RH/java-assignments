package com.te.springsecuritydemo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.te.springsecuritydemo.dao.StudentDao;
import com.te.springsecuritydemo.entity.Student;

@SpringBootApplication
public class SpringsecuritywithjwtdemoApplication {

	@Autowired
	private StudentDao dao;

	@PostConstruct
	public void initStudent() {
		List<Student> list = Stream.of(new Student(null, "Praveen", "praveenturai038@gmail.com", "qwerty"),
				new Student(null, "Amarsh", "amreshgouda@gmail.com", "zxcvb"),
				new Student(null, "Ranjith", "ranjith@gmail.com", "asdfg"),
				new Student(null, "RajKumar", "raj07t@gmail.com", "12345")).collect(Collectors.toList());
		dao.saveAll(list);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringsecuritywithjwtdemoApplication.class, args);
	}

}
