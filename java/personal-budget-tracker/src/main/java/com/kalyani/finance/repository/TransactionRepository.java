package com.kalyani.finance.repository;

import com.kalyani.finance.dto.CategorySpendingDTO;
import com.kalyani.finance.entity.Transaction;
import com.kalyani.finance.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    // =========================
    // GET ALL TRANSACTIONS BY USER
    // =========================
    List<Transaction> findByUser(User user);

    // =========================
    // GET TOTAL INCOME (USER-WISE)
    // =========================
    @Query("""
            SELECT COALESCE(SUM(t.amount), 0)
            FROM Transaction t
            WHERE t.user = :user
            AND t.type = 'INCOME'
            """)
    Double getTotalIncome(@Param("user") User user);

    // =========================
    // GET TOTAL EXPENSE (USER-WISE)
    // =========================
    @Query("""
            SELECT COALESCE(SUM(t.amount), 0)
            FROM Transaction t
            WHERE t.user = :user
            AND t.type = 'EXPENSE'
            """)
    Double getTotalExpense(@Param("user") User user);

    // =========================
    // CATEGORY-WISE EXPENSES
    // FIXED FOR PIE CHART
    // =========================
    @Query("""
            SELECT new com.kalyani.finance.dto.CategorySpendingDTO(
                t.category.name,
                SUM(t.amount)
            )
            FROM Transaction t
            WHERE t.user.id = :userId
            AND t.type = 'EXPENSE'
            GROUP BY t.category.name
            """)
    List<CategorySpendingDTO> getCategoryWiseSpending(
            @Param("userId") Long userId
    );
}