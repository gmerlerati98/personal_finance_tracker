package com.example.personalfinancetracker.repository;


import com.example.personalfinancetracker.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, Long> {
}

