package com.kalyani.finance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // ROOT URL → redirect to dashboard
    @GetMapping("/")
    public String home() {
        return "redirect:/dashboard";
    }
}