package com.employeecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeecrud.entity.Employee;
import com.employeecrud.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    // GET ALL
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    // SAVE OR UPDATE (same method handles both)
    public Employee saveEmployee(Employee emp) {
        return repo.save(emp);
    }

    // GET BY ID
    public Employee getEmployeeById(int id) {
        return repo.findById(id).orElse(null);
    }

    // DELETE
    public void deleteEmployee(int id) {
        repo.deleteById(id);
    }
}