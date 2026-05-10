package com.kalyani.finance.dto;

import java.util.List;

public class DashboardDTO {

    private double income;
    private double expense;
    private double balance;
    private List<CategorySpendingDTO> categorySpending;

    public DashboardDTO(double income, double expense, double balance,
                        List<CategorySpendingDTO> categorySpending) {
        this.income = income;
        this.expense = expense;
        this.balance = balance;
        this.categorySpending = categorySpending;
    }

    public double getIncome() {
        return income;
    }

    public double getExpense() {
        return expense;
    }

    public double getBalance() {
        return balance;
    }

    public List<CategorySpendingDTO> getCategorySpending() {
        return categorySpending;
    }
}