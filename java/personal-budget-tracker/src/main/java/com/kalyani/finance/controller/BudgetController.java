package com.kalyani.finance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BudgetController {

    @GetMapping("/budgets")
    public String budgets() {

        return "budgets";
    }
}