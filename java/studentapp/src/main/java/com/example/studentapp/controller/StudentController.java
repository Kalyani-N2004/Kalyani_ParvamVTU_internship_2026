package com.example.studentapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.studentapp.model.Student;
import com.example.studentapp.service.StudentService;

@RestController
@RequestMapping("/students")

// ✅ IMPORTANT: allows React (frontend) to call backend
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

    @Autowired
    private StudentService service;

    // ================= CREATE =================
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    // ================= READ ALL =================
    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // ================= READ BY ID =================
    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    // ================= UPDATE =================
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return service.getStudentById(id)
                .map(existing -> {
                    existing.setName(student.getName());
                    existing.setAge(student.getAge());
                    existing.setEmail(student.getEmail());
                    return service.saveStudent(existing);
                })
                .orElse(null);
    }

    // ================= DELETE =================
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
        return "Student deleted successfully";
    }
}