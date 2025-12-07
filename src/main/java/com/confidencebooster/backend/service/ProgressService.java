package com.confidencebooster.backend.service;

import com.confidencebooster.backend.model.Progress;

import java.util.List;

public interface ProgressService {
    Progress updateProgress(Long userId, Long problemId, Progress progress);
    List<Progress> getUserProgress(Long userId);
}
