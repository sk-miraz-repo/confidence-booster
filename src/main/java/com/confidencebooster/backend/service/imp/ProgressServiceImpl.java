package com.confidencebooster.backend.service.imp;

import com.confidencebooster.backend.model.Problem;
import com.confidencebooster.backend.model.Progress;
import com.confidencebooster.backend.model.User;
import com.confidencebooster.backend.repository.ProblemRepository;
import com.confidencebooster.backend.repository.ProgressRepository;
import com.confidencebooster.backend.repository.UserRepository;
import com.confidencebooster.backend.service.ProgressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProgressServiceImpl implements ProgressService {

    private final ProgressRepository progressRepo;
    private final UserRepository userRepo;
    private final ProblemRepository problemRepo;

    @Override
    public Progress updateProgress(Long userId, Long problemId, Progress progress) {
        User user = userRepo.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Problem problem = problemRepo.findById(problemId)
                .orElseThrow(() -> new RuntimeException("Problem not found"));

        progress.setUser(user);
        progress.setProblem(problem);

        return progressRepo.save(progress);
    }

    @Override
    public List<Progress> getUserProgress(Long userId) {
        return progressRepo.findByUser_Id(userId);
    }
}


