package com.kalyani.finance.controller;

import com.kalyani.finance.entity.Transaction;
import com.kalyani.finance.entity.User;
import com.kalyani.finance.service.TransactionService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @Autowired
    private TransactionService transactionService;

    // =========================
    // WALLET DASHBOARD (STEP 4.7)
    // =========================
    @GetMapping("/dashboard")
    public String dashboard(Model model, HttpSession session) {

        // =========================
        // CHECK USER SESSION
        // =========================
        User user = (User) session.getAttribute("user");

        if (user == null) {
            return "redirect:/login";
        }

        // =========================
        // FINANCIAL CALCULATIONS
        // =========================
        double income = transactionService.getTotalIncome(user);
        double expense = transactionService.getTotalExpense(user);
        double balance = transactionService.getBalance(user);

        // =========================
        // WALLET BUDGET LOGIC (SAFE)
        // =========================
        double budget = user.getBudget() != null ? user.getBudget() : 0.0;

        double remainingBudget = budget - expense;

        double usagePercent = 0.0;
        if (budget > 0) {
            usagePercent = (expense / budget) * 100;
        }

        // =========================
        // ALERT SYSTEM (WALLET FEATURE)
        // =========================
        String warning = null;

        if (budget > 0 && expense > budget) {
            warning = "🚨 You have exceeded your budget!";
        } else if (budget > 0 && usagePercent >= 80) {
            warning = "⚠️ You are close to your budget limit!";
        }

        // =========================
        // MODEL DATA (FRONTEND READY)
        // =========================
        model.addAttribute("income", income);
        model.addAttribute("expense", expense);
        model.addAttribute("balance", balance);

        model.addAttribute("budget", budget);
        model.addAttribute("remainingBudget", remainingBudget);
        model.addAttribute("usagePercent", usagePercent);

        model.addAttribute("warning", warning);

        model.addAttribute("transactions",
                transactionService.getUserTransactions(user));

        model.addAttribute("transaction", new Transaction());

        return "dashboard";
    }
}