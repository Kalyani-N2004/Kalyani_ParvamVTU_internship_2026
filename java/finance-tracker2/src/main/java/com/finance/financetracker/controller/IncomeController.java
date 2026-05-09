package com.finance.financetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.finance.financetracker.entity.Income;
import com.finance.financetracker.service.IncomeService;

@RestController
@RequestMapping("/income")
@CrossOrigin("*")
public class IncomeController {

    @Autowired
    private IncomeService service;

    @PostMapping("/add")
    public Income addIncome(@RequestBody Income income) {
        return service.addIncome(income);
    }

    @GetMapping("/all")
    public List<Income> getAllIncome() {
        return service.getAllIncome();
    }

    @PutMapping("/update/{id}")
    public Income updateIncome(@PathVariable Long id,
                                @RequestBody Income income) {
        return service.updateIncome(id, income);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteIncome(@PathVariable Long id) {
        service.deleteIncome(id);
        return "Income deleted successfully";
    }
}