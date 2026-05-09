package com.studentrelationship.model;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "student_class")
public class StudentClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String className;

    // one class → many students
    @OneToMany(mappedBy = "studentClass")
    private List<Student> students;

    // getters and setters

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getClassName() { return className; }

    public void setClassName(String className) { this.className = className; }

    public List<Student> getStudents() { return students; }

    public void setStudents(List<Student> students) { this.students = students; }
}