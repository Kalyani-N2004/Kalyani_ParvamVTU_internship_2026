package com.kalyani.finance.controller;

import com.kalyani.finance.entity.Transaction;
import com.kalyani.finance.entity.User;
import com.kalyani.finance.service.CategoryService;
import com.kalyani.finance.service.TransactionService;

import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private CategoryService categoryService;

    // =========================
    // OPEN ADD TRANSACTION PAGE
    // =========================
    @GetMapping("/add")
    public String addPage(HttpSession session,
                          Model model) {

        User user = (User) session.getAttribute("user");

        // CHECK LOGIN
        if (user == null) {
            return "redirect:/login";
        }

        // EMPTY TRANSACTION OBJECT
        model.addAttribute("transaction", new Transaction());

        // LOAD USER CATEGORIES
        model.addAttribute("categories",
                categoryService.getUserCategories(user));

        return "add-transaction";
    }

    // =========================
    // SAVE NEW TRANSACTION
    // =========================
    @PostMapping("/addTransaction")
    public String saveTransaction(
            @ModelAttribute Transaction transaction,
            HttpSession session) {

        User user = (User) session.getAttribute("user");

        // CHECK LOGIN
        if (user == null) {
            return "redirect:/login";
        }

        // SAVE TRANSACTION
        transactionService.saveTransaction(transaction, user);

        return "redirect:/dashboard";
    }

    // =========================
    // SHOW ALL TRANSACTIONS
    // =========================
    @GetMapping("/home")
    public String transactionsPage(Model model,
                                   HttpSession session) {

        User user = (User) session.getAttribute("user");

        // CHECK LOGIN
        if (user == null) {
            return "redirect:/login";
        }

        // LOAD TRANSACTIONS
        model.addAttribute("transactions",
                transactionService.getUserTransactions(user));

        return "transactions";
    }

    // =========================
    // OPEN EDIT PAGE
    // =========================
    @GetMapping("/edit/{id}")
    public String editTransaction(@PathVariable Long id,
                                  Model model,
                                  HttpSession session) {

        User user = (User) session.getAttribute("user");

        // CHECK LOGIN
        if (user == null) {
            return "redirect:/login";
        }

        // GET TRANSACTION
        Transaction transaction =
                transactionService.getById(id);

        // CHECK NULL
        if (transaction == null) {
            return "redirect:/dashboard";
        }

        // SEND TRANSACTION
        model.addAttribute("transaction", transaction);

        // SEND CATEGORIES
        model.addAttribute("categories",
                categoryService.getUserCategories(user));

        return "edit-transaction";
    }

    // =========================
    // UPDATE TRANSACTION
    // =========================
    @PostMapping("/update")
    public String updateTransaction(
            @ModelAttribute Transaction transaction,
            HttpSession session) {

        User user = (User) session.getAttribute("user");

        // CHECK LOGIN
        if (user == null) {
            return "redirect:/login";
        }

        // UPDATE TRANSACTION
        transactionService.saveTransaction(transaction, user);

        return "redirect:/dashboard";
    }

    // =========================
    // DELETE TRANSACTION
    // =========================
    @GetMapping("/delete/{id}")
    public String deleteTransaction(@PathVariable Long id,
                                    HttpSession session) {

        User user = (User) session.getAttribute("user");

        // CHECK LOGIN
        if (user == null) {
            return "redirect:/login";
        }

        // DELETE TRANSACTION
        transactionService.deleteTransaction(id, user);

        return "redirect:/dashboard";
    }
}