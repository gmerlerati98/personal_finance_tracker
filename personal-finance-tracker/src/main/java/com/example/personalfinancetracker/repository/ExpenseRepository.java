package com.example.personalfinancetracker.repository;

import com.example.personalfinancetracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    @Query("SELECT SUM(e.amount) FROM Expense e WHERE FUNCTION('MONTH', e.date) = :month AND FUNCTION('YEAR', e.date) = :year")
    Double getMonthlyExpenses(@Param("month") int month, @Param("year") int year);
}
