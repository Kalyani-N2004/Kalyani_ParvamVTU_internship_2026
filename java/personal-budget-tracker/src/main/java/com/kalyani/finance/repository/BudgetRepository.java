package com.kalyani.finance.repository;

import com.kalyani.finance.entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository
        extends JpaRepository<Budget, Long> {

}