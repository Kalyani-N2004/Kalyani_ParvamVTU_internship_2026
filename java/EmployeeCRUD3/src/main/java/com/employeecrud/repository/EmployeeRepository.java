package com.employeecrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employeecrud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}