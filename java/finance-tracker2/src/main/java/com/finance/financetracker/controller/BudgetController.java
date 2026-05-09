package com.finance.financetracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.finance.financetracker.entity.Budget;
import com.finance.financetracker.service.BudgetService;

@RestController
@RequestMapping("/budget")
@CrossOrigin("*")
public class BudgetController {

    @Autowired
    private BudgetService service;

    // Set or update budget
    @PostMapping("/set")
    public Budget setBudget(@RequestBody Budget budget) {
        return service.saveBudget(budget);
    }

    // Get current budget
    @GetMapping("/get")
    public Budget getBudget() {
        return service.getBudget();
    }
}