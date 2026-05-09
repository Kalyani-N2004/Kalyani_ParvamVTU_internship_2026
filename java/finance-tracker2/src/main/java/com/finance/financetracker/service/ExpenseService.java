package com.finance.financetracker.service;

import java.util.List;

import com.finance.financetracker.entity.Expense;

public interface ExpenseService {

    // CREATE
    Expense addExpense(Expense expense);

    // READ
    List<Expense> getAllExpenses();

    // UPDATE
    Expense updateExpense(Long id, Expense expense);

    // DELETE
    void deleteExpense(Long id);
}