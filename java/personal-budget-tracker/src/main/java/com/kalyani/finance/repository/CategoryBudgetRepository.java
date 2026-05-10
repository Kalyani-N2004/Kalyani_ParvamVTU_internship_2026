package com.kalyani.finance.repository;

import com.kalyani.finance.entity.CategoryBudget;
import com.kalyani.finance.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.YearMonth;
import java.util.List;
import java.util.Optional;

public interface CategoryBudgetRepository extends JpaRepository<CategoryBudget, Long> {

    List<CategoryBudget> findByUser(User user);

    Optional<CategoryBudget> findByUserAndCategoryAndMonth(
            User user,
            String category,
            YearMonth month
    );
}