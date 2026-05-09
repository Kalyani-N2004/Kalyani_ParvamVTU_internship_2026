package com.studentrelationship.model;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // 🔵 ONE TO ONE (Student - Address)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    // 🔵 MANY TO ONE (Student - Class)
    @ManyToOne
    @JoinColumn(name = "class_id")
    private StudentClass studentClass;

    // 🔵 MANY TO MANY (Student - Subject)
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "student_subject",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    private List<Subject> subjects;

    // getters and setters

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public Address getAddress() { return address; }

    public void setAddress(Address address) { this.address = address; }

    public StudentClass getStudentClass() { return studentClass; }

    public void setStudentClass(StudentClass studentClass) { this.studentClass = studentClass; }

    public List<Subject> getSubjects() { return subjects; }

    public void setSubjects(List<Subject> subjects) { this.subjects = subjects; }
}