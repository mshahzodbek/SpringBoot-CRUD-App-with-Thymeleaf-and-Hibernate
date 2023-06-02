package com.javadev.springcrudappthymeleafhibernate.repository;

import com.javadev.springcrudappthymeleafhibernate.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Long, Employee> {

}
