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

    // HOME DASHBOARD
    @GetMapping("/home")
    public String homePage(Model model) {

        model.addAttribute("transactions",
                transactionService.getAllTransactions());

        model.addAttribute("balance",
                transactionService.getBalance());

        return "home";
    }

    // SHOW ADD FORM
    @GetMapping("/add")
    public String showAddPage(Model model) {
        model.addAttribute("transaction", new Transaction());
        return "add-transaction";
    }

    // SAVE TRANSACTION
    @PostMapping("/add")
    public String saveTransaction(@ModelAttribute Transaction transaction) {

        transactionService.saveTransaction(transaction);

        return "redirect:/home";
    }
}