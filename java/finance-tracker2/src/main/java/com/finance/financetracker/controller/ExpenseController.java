package com.finance.financetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.finance.financetracker.entity.Expense;
import com.finance.financetracker.service.ExpenseService;

@RestController
@RequestMapping("/expense")
@CrossOrigin("*")
public class ExpenseController {

    @Autowired
    private ExpenseService service;

    // CREATE EXPENSE
    @PostMapping("/add")
    public Expense addExpense(@RequestBody Expense expense) {
        return service.addExpense(expense);
    }

    // GET ALL EXPENSES
    @GetMapping("/all")
    public List<Expense> getAllExpenses() {
        return service.getAllExpenses();
    }

    // UPDATE EXPENSE
    @PutMapping("/update/{id}")
    public Expense updateExpense(@PathVariable Long id,
                                 @RequestBody Expense expense) {
        return service.updateExpense(id, expense);
    }

    // DELETE EXPENSE
    @DeleteMapping("/delete/{id}")
    public String deleteExpense(@PathVariable Long id) {
        service.deleteExpense(id);
        return "Expense deleted successfully";
    }
}