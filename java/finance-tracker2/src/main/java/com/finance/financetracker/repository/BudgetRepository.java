package com.finance.financetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.finance.financetracker.entity.Budget;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {
}