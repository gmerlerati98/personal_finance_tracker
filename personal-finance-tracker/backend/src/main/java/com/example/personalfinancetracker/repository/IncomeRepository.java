package com.example.personalfinancetracker.repository;

import com.example.personalfinancetracker.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IncomeRepository extends JpaRepository<Income, Long> {

    @Query("SELECT SUM(i.amount) FROM Income i WHERE FUNCTION('MONTH', i.date) = :month AND FUNCTION('YEAR', i.date) = :year")
    Double getMonthlyIncome(@Param("month") int month, @Param("year") int year);
}


