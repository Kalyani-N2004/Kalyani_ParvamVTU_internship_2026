package com.finance.financetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.financetracker.dto.DashboardResponse;
import com.finance.financetracker.entity.Expense;
import com.finance.financetracker.entity.Income;
import com.finance.financetracker.repository.ExpenseRepository;
import com.finance.financetracker.repository.IncomeRepository;

@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private IncomeRepository incomeRepo;

    @Autowired
    private ExpenseRepository expenseRepo;

    @Override
    public DashboardResponse getDashboardData() {

        // Fetch all incomes
        List<Income> incomes = incomeRepo.findAll();

        // Fetch all expenses
        List<Expense> expenses = expenseRepo.findAll();

        // Calculate total income
        double totalIncome = incomes.stream()
                .mapToDouble(Income::getAmount)
                .sum();

        // Calculate total expense
        double totalExpense = expenses.stream()
                .mapToDouble(Expense::getAmount)
                .sum();

        // Calculate balance
        double balance = totalIncome - totalExpense;

        // Build response
        DashboardResponse response = new DashboardResponse();
        response.setTotalIncome(totalIncome);
        response.setTotalExpense(totalExpense);
        response.setBalance(balance);

        return response;
    }
}