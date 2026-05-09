package com.finance.financetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.finance.financetracker.entity.Income;

public interface IncomeRepository extends JpaRepository<Income, Long> {
}