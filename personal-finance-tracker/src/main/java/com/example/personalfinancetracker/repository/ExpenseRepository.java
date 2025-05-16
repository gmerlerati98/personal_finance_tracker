package com.example.personalfinancetracker.repository;


import com.example.personalfinancetracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
