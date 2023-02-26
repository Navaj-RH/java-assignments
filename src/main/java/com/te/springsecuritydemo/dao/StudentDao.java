package com.te.springsecuritydemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.springsecuritydemo.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer>{

}
