package com.finance.financetracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.financetracker.entity.Budget;
import com.finance.financetracker.repository.BudgetRepository;

import java.util.Optional;

@Service
public class BudgetServiceImpl implements BudgetService {

    @Autowired
    private BudgetRepository repository;

    @Override
    public Budget saveBudget(Budget budget) {

        Optional<Budget> existingBudget = repository.findAll()
                                                    .stream()
                                                    .findFirst();

        if (existingBudget.isPresent()) {

            Budget oldBudget = existingBudget.get();
            oldBudget.setMonthlyBudget(budget.getMonthlyBudget());

            return repository.save(oldBudget);
        }

        return repository.save(budget);
    }

    @Override
    public Budget getBudget() {
        return repository.findAll()
                         .stream()
                         .findFirst()
                         .orElse(null);
    }
}