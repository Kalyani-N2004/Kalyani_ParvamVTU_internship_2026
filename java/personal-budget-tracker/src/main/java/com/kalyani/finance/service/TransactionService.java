package com.kalyani.finance.service;

import com.kalyani.finance.entity.Transaction;
import com.kalyani.finance.entity.User;
import com.kalyani.finance.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    // SAVE
    public Transaction saveTransaction(Transaction transaction, User user) {

        transaction.setDate(LocalDate.now());
        transaction.setUser(user);

        if (transaction.getType() != null) {
            transaction.setType(transaction.getType().trim().toUpperCase());
        }

        return transactionRepository.save(transaction);
    }

    // GET ALL USER TXN
    public List<Transaction> getUserTransactions(User user) {
        return transactionRepository.findByUser(user);
    }

    // INCOME
    public double getTotalIncome(User user) {
        return transactionRepository.findByUser(user)
                .stream()
                .filter(t -> "INCOME".equalsIgnoreCase(t.getType()))
                .mapToDouble(Transaction::getAmount)
                .sum();
    }

    // EXPENSE
    public double getTotalExpense(User user) {
        return transactionRepository.findByUser(user)
                .stream()
                .filter(t -> "EXPENSE".equalsIgnoreCase(t.getType()))
                .mapToDouble(Transaction::getAmount)
                .sum();
    }

    // BALANCE
    public double getBalance(User user) {
        return getTotalIncome(user) - getTotalExpense(user);
    }

    // GET BY ID (MISSING BEFORE — IMPORTANT FIX)
    public Transaction getById(Long id) {
        return transactionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction not found: " + id));
    }

    // DELETE
    public void deleteTransaction(Long id, User user) {

        Transaction transaction = getById(id);

        if (transaction.getUser() != null &&
            transaction.getUser().getId().equals(user.getId())) {

            transactionRepository.deleteById(id);
        } else {
            throw new RuntimeException("Unauthorized delete attempt");
        }
    }
}