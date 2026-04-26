package studentapp2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

import studentapp2.model.Student;
import studentapp2.repository.StudentRepository;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository repo;

    // SHOW ALL STUDENTS
    @GetMapping("/students")
    public String getStudents(Model model) {
        model.addAttribute("students", repo.findAll());
        return "students";
    }

    // SHOW ADD FORM
    @GetMapping("/students/new")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }

    // SAVE (ADD + UPDATE)
    @PostMapping("/students/save")
    public String saveStudent(@ModelAttribute Student student) {
        repo.save(student);
        return "redirect:/students";
    }

    // EDIT FORM
    @GetMapping("/students/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Student student = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        model.addAttribute("student", student);
        return "add-student";
    }
    @GetMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        repo.deleteById(id);
        return "redirect:/students";
    }
}