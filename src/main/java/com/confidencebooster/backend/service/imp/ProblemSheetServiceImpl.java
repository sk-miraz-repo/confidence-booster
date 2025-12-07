package com.confidencebooster.backend.service.imp;

import com.confidencebooster.backend.model.ProblemSheet;
import com.confidencebooster.backend.repository.ProblemSheetRepository;
import com.confidencebooster.backend.service.ProblemSheetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProblemSheetServiceImpl implements ProblemSheetService {

    private final ProblemSheetRepository sheetRepo;

    @Override
    public ProblemSheet createSheet(ProblemSheet sheet) {
        return sheetRepo.save(sheet);
    }

    @Override
    public List<ProblemSheet> getAllSheets() {
        return sheetRepo.findAll();
    }
}

