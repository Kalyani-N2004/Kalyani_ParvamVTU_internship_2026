package com.finance.financetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.financetracker.entity.Income;
import com.finance.financetracker.repository.IncomeRepository;

@Service
public class IncomeServiceImpl implements IncomeService {

    @Autowired
    private IncomeRepository repository;

    @Override
    public Income addIncome(Income income) {
        return repository.save(income);
    }

    @Override
    public List<Income> getAllIncome() {
        return repository.findAll();
    }

    @Override
    public Income updateIncome(Long id, Income income) {

        Income existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Income not found"));

        existing.setSource(income.getSource());
        existing.setAmount(income.getAmount());
        existing.setDate(income.getDate());

        return repository.save(existing);
    }

    @Override
    public void deleteIncome(Long id) {
        repository.deleteById(id);
    }
}