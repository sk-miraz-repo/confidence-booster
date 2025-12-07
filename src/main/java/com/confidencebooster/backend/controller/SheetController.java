package com.confidencebooster.backend.controller;

import com.confidencebooster.backend.model.ProblemSheet;
import com.confidencebooster.backend.service.ProblemSheetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sheets")
@RequiredArgsConstructor
public class SheetController {

    private final ProblemSheetService sheetService;

    @PostMapping
    public ProblemSheet createSheet(@RequestBody ProblemSheet sheet) {
        return sheetService.createSheet(sheet);
    }

    @GetMapping
    public List<ProblemSheet> getAllSheets() {
        return sheetService.getAllSheets();
    }
}

