package com.confidencebooster.backend.service;

import com.confidencebooster.backend.model.Problem;

import java.util.List;

public interface ProblemService {
    Problem addProblem(Long sheetId, Problem problem);
    List<Problem> getProblems(Long sheetId);
}
