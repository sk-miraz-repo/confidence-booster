package com.confidencebooster.backend.service;

import com.confidencebooster.backend.model.ProblemSheet;

import java.util.List;

public interface ProblemSheetService {
    ProblemSheet createSheet(ProblemSheet sheet);
    List<ProblemSheet> getAllSheets();
}
