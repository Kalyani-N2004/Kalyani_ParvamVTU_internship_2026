package com.example.studentapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentapp.model.Student;
import com.example.studentapp.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    // CREATE / SAVE student
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    // GET ALL students
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // GET student by ID
    public Optional<Student> getStudentById(Long id) {
        return repository.findById(id);
    }

    // DELETE student
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}