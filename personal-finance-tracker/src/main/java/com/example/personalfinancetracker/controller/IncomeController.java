package com.example.personalfinancetracker.controller;


import com.example.personalfinancetracker.model.Income;
import com.example.personalfinancetracker.service.IncomeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/incomes")
public class IncomeController {

    private final IncomeService service;

    public IncomeController(IncomeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Income> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Income create(@RequestBody Income income) {
        return service.create(income);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}

