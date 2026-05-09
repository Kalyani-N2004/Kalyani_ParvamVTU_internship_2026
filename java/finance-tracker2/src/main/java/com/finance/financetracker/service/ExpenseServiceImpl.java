package com.finance.financetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.financetracker.entity.Expense;
import com.finance.financetracker.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository repository;

    // CREATE
    @Override
    public Expense addExpense(Expense expense) {
        return repository.save(expense);
    }

    // READ
    @Override
    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    // UPDATE
    @Override
    public Expense updateExpense(Long id, Expense expense) {

        Expense existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Expense not found with id: " + id));

        existing.setTitle(expense.getTitle());
        existing.setAmount(expense.getAmount());
        existing.setCategory(expense.getCategory());
        existing.setDate(expense.getDate());

        return repository.save(existing);
    }

    // DELETE
    @Override
    public void deleteExpense(Long id) {
        repository.deleteById(id);
    }
}