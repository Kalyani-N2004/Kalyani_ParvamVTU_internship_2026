package com.finance.financetracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.finance.financetracker.dto.DashboardResponse;
import com.finance.financetracker.service.DashboardService;

@RestController
@RequestMapping("/dashboard")
@CrossOrigin("*")
public class DashboardController {

    @Autowired
    private DashboardService service;

    @GetMapping("/summary")
    public DashboardResponse getSummary() {
        return service.getDashboardData();
    }
}