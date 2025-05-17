package com.example.personalfinancetracker.service;


import com.example.personalfinancetracker.model.Income;
import com.example.personalfinancetracker.repository.IncomeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IncomeService {

    private final IncomeRepository repo;

    public IncomeService(IncomeRepository repo) {
        this.repo = repo;
    }

    public List<Income> getAll() {
        return repo.findAll();
    }

    public Income create(Income income) {
        return repo.save(income);
    }
    public boolean delete(Long id) {
        Optional<Income> incomeOpt = repo.findById(id);
        if (incomeOpt.isPresent()) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }

}

