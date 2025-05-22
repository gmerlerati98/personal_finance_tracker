package com.example.personalfinancetracker.dto;

import lombok.Getter;

@Getter
public class MonthlySummaryDTO {
    // Getters and Setters
    private double totalIncome;
    private double totalExpenses;
    private double netSavings;

    public MonthlySummaryDTO(double totalIncome, double totalExpenses) {
        this.totalIncome = totalIncome;
        this.totalExpenses = totalExpenses;
        this.netSavings = totalIncome - totalExpenses;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public void setTotalExpenses(double totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public void setNetSavings(double netSavings) {
        this.netSavings = netSavings;
    }
}
