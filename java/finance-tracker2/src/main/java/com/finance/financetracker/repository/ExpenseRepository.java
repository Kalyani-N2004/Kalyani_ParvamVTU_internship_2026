package com.finance.financetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.financetracker.entity.Expense;

public interface ExpenseRepository 
       extends JpaRepository<Expense, Long> {

}