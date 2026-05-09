package com.kalyani.finance.controller;

import com.kalyani.finance.entity.Transaction;
import com.kalyani.finance.entity.User;
import com.kalyani.finance.service.TransactionService;
import com.kalyani.finance.service.UserService;
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
    private UserService userService;

    // ================= ADD PAGE =================
    @GetMapping("/add")
    public String addPage(HttpSession session, Model model) {

        User user = (User) session.getAttribute("user");

        if (user == null) {
            return "redirect:/login";
        }

        model.addAttribute("transaction", new Transaction());
        return "add-transaction";
    }

    // ================= SAVE TRANSACTION =================
    @PostMapping("/addTransaction")
    public String saveTransaction(@ModelAttribute Transaction transaction,
                                  HttpSession session) {

        User user = (User) session.getAttribute("user");

        if (user == null) {
            return "redirect:/login";
        }

        transactionService.saveTransaction(transaction, user);

        return "redirect:/dashboard";
    }

    // ================= ALL TRANSACTIONS =================
    @GetMapping("/home")
    public String transactionsPage(Model model, HttpSession session) {

        User user = (User) session.getAttribute("user");

        if (user == null) {
            return "redirect:/login";
        }

        model.addAttribute("transactions", transactionService.getUserTransactions(user));

        return "transactions";
    }

    // ================= EDIT =================
    @GetMapping("/edit/{id}")
    public String editTransaction(@PathVariable Long id, Model model, HttpSession session) {

        User user = (User) session.getAttribute("user");

        if (user == null) {
            return "redirect:/login";
        }

        model.addAttribute("transaction", transactionService.getById(id));
        return "edit-transaction";
    }

    // ================= UPDATE =================
    @PostMapping("/update")
    public String updateTransaction(@ModelAttribute Transaction transaction,
                                    HttpSession session) {

        User user = (User) session.getAttribute("user");

        if (user == null) {
            return "redirect:/login";
        }

        transactionService.saveTransaction(transaction, user);

        return "redirect:/dashboard";
    }

    // ================= SET BUDGET =================
    @PostMapping("/setBudget")
    public String setBudget(@RequestParam("budget") double budget,
                            HttpSession session) {

        User user = (User) session.getAttribute("user");

        if (user == null) {
            return "redirect:/login";
        }

        user.setBudget(budget);
        session.setAttribute("user", user);

        userService.saveUser(user); // OR updateUser if you created it

        return "redirect:/dashboard";
    }

    // ================= DELETE =================
    @GetMapping("/delete/{id}")
    public String deleteTransaction(@PathVariable Long id,
                                    HttpSession session) {

        User user = (User) session.getAttribute("user");

        if (user == null) {
            return "redirect:/login";
        }

        transactionService.deleteTransaction(id, user);

        return "redirect:/dashboard";
    }
}