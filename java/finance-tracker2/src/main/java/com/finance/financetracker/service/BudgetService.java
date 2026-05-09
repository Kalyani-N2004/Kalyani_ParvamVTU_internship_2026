package com.finance.financetracker.service;

import com.finance.financetracker.entity.Budget;

public interface BudgetService {

    Budget saveBudget(Budget budget);

    Budget getBudget();
}