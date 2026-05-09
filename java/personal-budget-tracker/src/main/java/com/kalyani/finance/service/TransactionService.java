package com.kalyani.finance.service;

import com.kalyani.finance.entity.Transaction;
import com.kalyani.finance.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    // Save transaction
    public Transaction saveTransaction(Transaction transaction) {
        transaction.setDate(LocalDate.now());
        return transactionRepository.save(transaction);
    }

    // Get all transactions
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    // Calculate balance
    public Double getBalance() {

        double income = 0;
        double expense = 0;

        for (Transaction t : transactionRepository.findAll()) {
            if (t.getType().equalsIgnoreCase("INCOME")) {
                income += t.getAmount();
            } else if (t.getType().equalsIgnoreCase("EXPENSE")) {
                expense += t.getAmount();
            }
        }

        return income - expense;
    }
}