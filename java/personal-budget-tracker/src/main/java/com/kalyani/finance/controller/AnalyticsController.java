package com.kalyani.finance.controller;

import com.kalyani.finance.dto.CategorySpendingDTO;
import com.kalyani.finance.entity.User;
import com.kalyani.finance.service.TransactionService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class AnalyticsController {

    @Autowired
    private TransactionService transactionService;

    // =====================================
    // CATEGORY-WISE SPENDING (WALLET API)
    // =====================================
    @GetMapping("/api/spending-summary")
    public List<CategorySpendingDTO> getSummary(HttpSession session) {

        // =========================
        // GET USER FROM SESSION
        // =========================
        User user = (User) session.getAttribute("user");

        // =========================
        // SAFETY CHECK (IMPORTANT)
        // =========================
        if (user == null) {
            return Collections.emptyList();
        }

        // =========================
        // CALL SERVICE LAYER
        // =========================
        return transactionService.getCategorySpending(user);
    }
}