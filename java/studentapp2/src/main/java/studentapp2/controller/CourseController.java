package studentapp2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import studentapp2.model.Course;
import studentapp2.repository.CourseRepository;
import studentapp2.repository.StudentRepository;

@Controller
public class CourseController {

    @Autowired
    private CourseRepository courseRepo;

    @Autowired
    private StudentRepository studentRepo;

    @GetMapping("/courses/new")
    public String showCourseForm(Model model) {
        model.addAttribute("course", new Course());
        model.addAttribute("students", studentRepo.findAll());
        return "add-course";
    }

    @PostMapping("/courses/save")
    public String saveCourse(@ModelAttribute Course course) {

        Long studentId = course.getStudent().getId();

        course.setStudent(studentRepo.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found")));

        courseRepo.save(course);

        return "redirect:/students";
    }
}