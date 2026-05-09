package com.kalyani.finance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    // CHANGED PATH (NO CONFLICT)
    @GetMapping("/dashboard-home")
    public String dashboard(Model model) {

        model.addAttribute("message", "Dashboard test page");

        return "dashboard";
    }
}