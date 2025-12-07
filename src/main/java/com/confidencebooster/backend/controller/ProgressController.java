package com.confidencebooster.backend.controller;

import com.confidencebooster.backend.model.Progress;
import com.confidencebooster.backend.service.ProgressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/progress")
@RequiredArgsConstructor
public class ProgressController {

    private final ProgressService progressService;

    // Update or create progress for a user for a specific problem
    @PostMapping("/update")
    public Progress updateProgress(@RequestParam Long userId,
                                   @RequestParam Long problemId,
                                   @RequestBody Progress progress) {
        return progressService.updateProgress(userId, problemId, progress);
    }

    // Get all progress of a specific user
    @GetMapping("/user/{userId}")
    public List<Progress> getUserProgress(@PathVariable Long userId) {
        return progressService.getUserProgress(userId);
    }
}

