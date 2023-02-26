package com.te.springbatchdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.springbatchdemo.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
