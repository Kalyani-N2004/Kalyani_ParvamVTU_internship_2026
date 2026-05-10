package com.kalyani.finance.service;

import com.kalyani.finance.entity.CategoryBudget;
import com.kalyani.finance.entity.User;
import com.kalyani.finance.repository.CategoryBudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.YearMonth;
import java.util.List;

@Service
public class CategoryBudgetService {

    @Autowired
    private CategoryBudgetRepository repo;

    public CategoryBudget setBudget(User user, String category, double amount) {

        YearMonth month = YearMonth.now();

        CategoryBudget budget = repo
                .findByUserAndCategoryAndMonth(user, category, month)
                .orElse(new CategoryBudget());

        budget.setUser(user);
        budget.setCategory(category);
        budget.setBudget(amount);
        budget.setMonth(month);

        return repo.save(budget);
    }

    public List<CategoryBudget> getUserBudgets(User user) {
        return repo.findByUser(user);
    }
}