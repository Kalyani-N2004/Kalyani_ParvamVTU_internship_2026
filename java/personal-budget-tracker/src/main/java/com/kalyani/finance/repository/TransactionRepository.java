package com.kalyani.finance.repository;

import com.kalyani.finance.entity.Transaction;
import com.kalyani.finance.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByUser(User user);
}