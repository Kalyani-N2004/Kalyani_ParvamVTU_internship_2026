package com.kalyani.finance.entity;

import jakarta.persistence.*;
import java.time.YearMonth;

@Entity
@Table(name = "category_budget")
public class CategoryBudget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;

    private double budget;

    private YearMonth month;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public CategoryBudget() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public YearMonth getMonth() {
        return month;
    }

    public void setMonth(YearMonth month) {
        this.month = month;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}