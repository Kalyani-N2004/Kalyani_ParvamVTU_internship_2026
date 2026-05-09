package com.kalyani.finance.controller;

import com.kalyani.finance.entity.Transaction;
import com.kalyani.finance.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    // ===================== DASHBOARD =====================
    @GetMapping("/dashboard")
    public String dashboard(Model model) {

        model.addAttribute("income", transactionService.getTotalIncome());
        model.addAttribute("expense", transactionService.getTotalExpense());
        model.addAttribute("balance", transactionService.getBalance());

        return "dashboard";
    }

    // ===================== HOME (TRANSACTIONS LIST) =====================
    @GetMapping("/home")
    public String home(Model model) {

        model.addAttribute("transactions", transactionService.getAllTransactions());

        return "home";
    }

    // ===================== ADD PAGE =====================
    @GetMapping("/add")
    public String addPage(Model model) {

        model.addAttribute("transaction", new Transaction());

        return "add-transaction";
    }

    // ===================== SAVE TRANSACTION =====================
    @PostMapping("/addTransaction")
    public String saveTransaction(@ModelAttribute Transaction transaction) {

        transactionService.saveTransaction(transaction);

        return "redirect:/home";
    }

    // ===================== EDIT PAGE =====================
    @GetMapping("/edit/{id}")
    public String editTransaction(@PathVariable Long id, Model model) {

        Transaction transaction = transactionService.getById(id);

        model.addAttribute("transaction", transaction);

        return "edit-transaction";
    }

    // ===================== UPDATE TRANSACTION =====================
    @PostMapping("/update")
    public String updateTransaction(@ModelAttribute Transaction transaction) {

        transactionService.saveTransaction(transaction);

        return "redirect:/home";
    }

    // ===================== DELETE TRANSACTION =====================
    @GetMapping("/delete/{id}")
    public String deleteTransaction(@PathVariable Long id) {

        transactionService.deleteTransaction(id);

        return "redirect:/home";
    }
}