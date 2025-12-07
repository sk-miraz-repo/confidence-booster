package com.confidencebooster.backend.repository;

import com.confidencebooster.backend.model.Problem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProblemRepository extends JpaRepository<Problem, Long> {
    List<Problem> findBySheet_Id(Long sheetId);
}
