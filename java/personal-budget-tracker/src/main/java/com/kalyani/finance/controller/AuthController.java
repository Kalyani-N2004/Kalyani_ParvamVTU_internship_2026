package com.kalyani.finance.controller;

import com.kalyani.finance.entity.User;
import com.kalyani.finance.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    // ================= LOGIN PAGE =================
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    // ================= LOGIN PROCESS =================
    @PostMapping("/login")
    public String login(@RequestParam("email") String email,
                        @RequestParam("password") String password,
                        HttpSession session,
                        Model model) {

        User user = userService.loginUser(email, password);

        if (user != null) {
            session.setAttribute("user", user);
            return "redirect:/dashboard";
        } else {
            model.addAttribute("error", "Invalid email or password");
            return "login";
        }
    }

    // ================= REGISTER PAGE =================
    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    // ================= REGISTER SAVE =================
    @PostMapping("/register/save")
    public String registerUser(@ModelAttribute User user, Model model) {

        String result = userService.saveUser(user);

        if ("Email already registered!".equals(result)) {
            model.addAttribute("message", result);
            return "register";
        }

        return "redirect:/login?success";
    }
}