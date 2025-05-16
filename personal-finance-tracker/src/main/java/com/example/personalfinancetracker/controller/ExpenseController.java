package com.example.personalfinancetracker.controller;

import com.example.personalfinancetracker.model.Expense;
import com.example.personalfinancetracker.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    private final ExpenseService service;

    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

    @GetMapping
    public List<Expense> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Expense create(@RequestBody Expense expense) {
        return service.create(expense);
    }
}
