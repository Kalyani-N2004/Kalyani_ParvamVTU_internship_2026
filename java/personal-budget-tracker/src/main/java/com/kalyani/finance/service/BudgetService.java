package com.kalyani.finance.service;

import com.kalyani.finance.entity.Budget;
import com.kalyani.finance.repository.BudgetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {

    @Autowired
    private BudgetRepository budgetRepository;

    // Save budget
    public Budget saveBudget(Budget budget) {

        return budgetRepository.save(budget);
    }

    // Get all budgets
    public List<Budget> getAllBudgets() {

        return budgetRepository.findAll();
    }
}