package com.finance.financetracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Monthly budget amount
    private double monthlyBudget;

    // Optional but IMPORTANT for real projects
    private String month; // Example: "May-2026"

    // Default constructor
    public Budget() {
    }

    // Parameterized constructor (optional but useful)
    public Budget(Long id, double monthlyBudget, String month) {
        this.id = id;
        this.monthlyBudget = monthlyBudget;
        this.month = month;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMonthlyBudget() {
        return monthlyBudget;
    }

    public void setMonthlyBudget(double monthlyBudget) {
        this.monthlyBudget = monthlyBudget;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}