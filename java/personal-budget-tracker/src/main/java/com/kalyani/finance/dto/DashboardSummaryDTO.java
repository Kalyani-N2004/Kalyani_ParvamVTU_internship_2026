package com.kalyani.finance.dto;

public class DashboardSummaryDTO {

    private double income;
    private double expense;
    private double balance;

    public DashboardSummaryDTO() {}

    public DashboardSummaryDTO(double income, double expense) {
        this.income = income;
        this.expense = expense;
        this.balance = income - expense;
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
}