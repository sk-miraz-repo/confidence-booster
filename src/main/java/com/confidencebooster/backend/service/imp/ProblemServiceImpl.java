package com.confidencebooster.backend.service.imp;

import com.confidencebooster.backend.model.Problem;
import com.confidencebooster.backend.model.ProblemSheet;
import com.confidencebooster.backend.repository.ProblemRepository;
import com.confidencebooster.backend.repository.ProblemSheetRepository;
import com.confidencebooster.backend.service.ProblemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProblemServiceImpl implements ProblemService {

    private final ProblemRepository problemRepo;
    private final ProblemSheetRepository sheetRepo;

    @Override
    public Problem addProblem(Long sheetId, Problem problem) {
        ProblemSheet sheet = sheetRepo.findById(sheetId)
                .orElseThrow(() -> new RuntimeException("Sheet not found"));
        problem.setSheet(sheet);
        return problemRepo.save(problem);
    }

    @Override
    public List<Problem> getProblems(Long sheetId) {
        return problemRepo.findBySheet_Id(sheetId);
    }

}

