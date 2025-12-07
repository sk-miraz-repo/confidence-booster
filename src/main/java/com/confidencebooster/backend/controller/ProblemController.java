package com.confidencebooster.backend.controller;

import com.confidencebooster.backend.model.Problem;
import com.confidencebooster.backend.service.ProblemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/problems")
@RequiredArgsConstructor
public class ProblemController {

    private final ProblemService problemService;

    @PostMapping("/{sheetId}")
    public Problem addProblem(@PathVariable Long sheetId, @RequestBody Problem problem) {
        return problemService.addProblem(sheetId, problem);
    }

    @GetMapping("/sheet/{sheetId}")
    public List<Problem> getProblems(@PathVariable Long sheetId) {
        return problemService.getProblems(sheetId);
    }
}
