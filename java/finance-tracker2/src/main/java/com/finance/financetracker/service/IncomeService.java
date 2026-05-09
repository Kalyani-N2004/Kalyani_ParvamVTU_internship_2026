package com.finance.financetracker.service;

import java.util.List;
import com.finance.financetracker.entity.Income;

public interface IncomeService {

    Income addIncome(Income income);

    List<Income> getAllIncome();

    Income updateIncome(Long id, Income income);

    void deleteIncome(Long id);
}