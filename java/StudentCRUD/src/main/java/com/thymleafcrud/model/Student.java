package com.thymleafcrud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
@Data // to avoid getters and setters
@AllArgsConstructor  // to avoid all arg constructor
@NoArgsConstructor // to avoid no arg constructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // it will increment primary key auto when we insert data in table
	private Long id;
	
	@NotBlank(message = "Name is required")
	@Column(nullable =  false)
	private String name;
	
	@NotBlank(message = "Email is required")
	@Email(message = "Invalid Email address")
	@Column(nullable =  false, unique = true)
	private String email;
	
	@Min(value = 1, message = "Age must be positive")
	@Max(value = 150, message = "Age not realistic")
	private Integer age;
	
	@NotBlank(message = "Course is required")
	private String course;
	
	public Student() {
		super();
	}

	public Student(Long id, @NotBlank(message = "Name is required") String name,
			@NotBlank(message = "Email is required") @Email(message = "Invalid Email address") String email,
			@Min(value = 1, message = "Age must be positive") @Max(value = 150, message = "Age not realistic") Integer age,
			@NotBlank(message = "Course is required") String course) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.course = course;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
