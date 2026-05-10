package com.kalyani.finance.service;

import com.kalyani.finance.dto.CategorySpendingDTO;
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

    // =========================
    // SAVE / UPDATE TRANSACTION
    // =========================
    public Transaction saveTransaction(Transaction transaction,
                                       User user) {

        // SET USER
        transaction.setUser(user);

        // SET DATE IF NULL
        if (transaction.getDate() == null) {
            transaction.setDate(LocalDate.now());
        }

        // NORMALIZE TYPE
        if (transaction.getType() != null) {

            transaction.setType(
                    transaction.getType()
                            .trim()
                            .toUpperCase()
            );
        }

        return transactionRepository.save(transaction);
    }

    // =========================
    // GET ALL USER TRANSACTIONS
    // =========================
    public List<Transaction> getUserTransactions(User user) {

        return transactionRepository.findByUser(user);
    }

    // =========================
    // GET TRANSACTION BY ID
    // =========================
    public Transaction getById(Long id) {

        return transactionRepository
                .findById(id)
                .orElse(null);
    }

    // =========================
    // TOTAL INCOME
    // =========================
    public double getTotalIncome(User user) {

        Double income =
                transactionRepository.getTotalIncome(user);

        return income != null ? income : 0.0;
    }

    // =========================
    // TOTAL EXPENSE
    // =========================
    public double getTotalExpense(User user) {

        Double expense =
                transactionRepository.getTotalExpense(user);

        return expense != null ? expense : 0.0;
    }

    // =========================
    // BALANCE
    // =========================
    public double getBalance(User user) {

        return getTotalIncome(user)
                - getTotalExpense(user);
    }

    // =========================
    // DELETE TRANSACTION
    // =========================
    public void deleteTransaction(Long id,
                                  User user) {

        Transaction transaction = getById(id);

        // CHECK NULL
        if (transaction == null) {
            return;
        }

        // SECURITY CHECK
        if (transaction.getUser() != null &&
                transaction.getUser()
                        .getId()
                        .equals(user.getId())) {

            transactionRepository.delete(transaction);

        } else {

            throw new RuntimeException(
                    "Unauthorized delete attempt"
            );
        }
    }

    // =========================
    // CATEGORY WISE SPENDING
    // =========================
    public List<CategorySpendingDTO> getCategorySpending(User user) {

        return transactionRepository
                .getCategoryWiseSpending(user.getId());
    }
}