package com.confidencebooster.backend.repository;

import com.confidencebooster.backend.model.Progress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

    public interface ProgressRepository extends JpaRepository<Progress, Long> {
        List<Progress> findByUser_Id(Long userId);
        List<Progress> findByProblem_Id(Long problemId);
    }
