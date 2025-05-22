package com.example.personalfinancetracker.service;

import com.example.personalfinancetracker.dto.MonthlySummaryDTO;
import com.example.personalfinancetracker.repository.ExpenseRepository;
import com.example.personalfinancetracker.repository.IncomeRepository;
import org.springframework.stereotype.Service;

@Service
public class SummaryService {

    private final IncomeRepository incomeRepo;
    private final ExpenseRepository expenseRepo;

    public SummaryService(IncomeRepository incomeRepo, ExpenseRepository expenseRepo) {
        this.incomeRepo = incomeRepo;
        this.expenseRepo = expenseRepo;
    }

    public MonthlySummaryDTO getMonthlySummary(int year, int month) {
        double totalIncome = incomeRepo.getMonthlyIncome(month, year) != null ? incomeRepo.getMonthlyIncome(month, year) : 0.0;
        double totalExpenses = expenseRepo.getMonthlyExpenses(month, year) != null ? expenseRepo.getMonthlyExpenses(month, year) : 0.0;
        return new MonthlySummaryDTO(totalIncome, totalExpenses);
    }
}
