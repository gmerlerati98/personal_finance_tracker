package com.example.personalfinancetracker.service;


import com.example.personalfinancetracker.model.Expense;
import com.example.personalfinancetracker.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    private final ExpenseRepository repo;

    public ExpenseService(ExpenseRepository repo) {
        this.repo = repo;
    }

    public List<Expense> getAll() {
        return repo.findAll();
    }

    public Expense create(Expense expense) {
        return repo.save(expense);
    }

    public boolean delete(Long id) {
        Optional<Expense> expenseOpt = repo.findById(id);
        if (expenseOpt.isPresent()) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }
}

