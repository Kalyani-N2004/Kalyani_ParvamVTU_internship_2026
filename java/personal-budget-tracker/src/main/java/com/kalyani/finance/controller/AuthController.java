package com.kalyani.finance.controller;

import com.kalyani.finance.entity.User;
import com.kalyani.finance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    // Login Page
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    // LOGIN SUBMIT (FIXED)
    @PostMapping("/login")
    public String loginUser() {
        return "redirect:/dashboard";   // ✅ FIXED HERE
    }

    // Register Page
    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    // Save User
    @PostMapping("/register/save")
    public String registerUser(@ModelAttribute User user, Model model) {

        String result = userService.saveUser(user);

        if(result.equals("Email already registered!")) {
            model.addAttribute("message", result);
            return "register";
        }

        return "redirect:/login?success";
    }
}