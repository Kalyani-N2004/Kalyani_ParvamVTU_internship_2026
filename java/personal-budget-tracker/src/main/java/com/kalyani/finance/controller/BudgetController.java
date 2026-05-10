package com.kalyani.finance.controller;

import com.kalyani.finance.entity.User;
import com.kalyani.finance.repository.UserRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BudgetController {

    @Autowired
    private UserRepository userRepository;

    // SHOW PAGE
    @GetMapping("/budgets")
    public String budgets(HttpSession session) {

        User user = (User) session.getAttribute("user");

        if (user == null) {
            return "redirect:/login";
        }

        return "budgets";
    }

    // SET / UPDATE BUDGET (ONLY HERE)
    @PostMapping("/setBudget")
    public String setBudget(@RequestParam("budget") Double budget,
                            HttpSession session) {

        User user = (User) session.getAttribute("user");

        if (user == null) {
            return "redirect:/login";
        }

        user.setBudget(budget);
        userRepository.save(user);

        session.setAttribute("user", user);

        return "redirect:/dashboard";
    }
}