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

    // =========================
    // SAVE TRANSACTION
    // =========================
    public Transaction saveTransaction(Transaction transaction) {

        transaction.setDate(LocalDate.now());

        // normalize type
        if (transaction.getType() != null) {
            transaction.setType(transaction.getType().trim().toUpperCase());
        }

        return transactionRepository.save(transaction);
    }

    // =========================
    // GET ALL TRANSACTIONS
    // =========================
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    // =========================
    // GET BY ID (FIX FOR YOUR ERROR)
    // =========================
    public Transaction getById(Long id) {
        return transactionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction not found with id: " + id));
    }

    // =========================
    // TOTAL INCOME
    // =========================
    public double getTotalIncome() {
        return transactionRepository.findAll()
                .stream()
                .filter(t -> "INCOME".equalsIgnoreCase(t.getType()))
                .mapToDouble(Transaction::getAmount)
                .sum();
    }

    // =========================
    // TOTAL EXPENSE
    // =========================
    public double getTotalExpense() {
        return transactionRepository.findAll()
                .stream()
                .filter(t -> "EXPENSE".equalsIgnoreCase(t.getType()))
                .mapToDouble(Transaction::getAmount)
                .sum();
    }

    // =========================
    // BALANCE
    // =========================
    public double getBalance() {
        return getTotalIncome() - getTotalExpense();
    }

    // =========================
    // DELETE TRANSACTION
    // =========================
    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }
}