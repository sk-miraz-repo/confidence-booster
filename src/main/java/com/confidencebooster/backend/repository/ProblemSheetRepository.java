package com.confidencebooster.backend.repository;

import com.confidencebooster.backend.model.ProblemSheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemSheetRepository extends JpaRepository<ProblemSheet, Long> {
}
