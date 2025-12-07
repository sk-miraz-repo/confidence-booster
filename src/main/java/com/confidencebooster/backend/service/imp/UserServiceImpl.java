package com.confidencebooster.backend.service.imp;

import com.confidencebooster.backend.model.User;
import com.confidencebooster.backend.repository.UserRepository;
import com.confidencebooster.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("User not found with id: " + id));
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(()-> new RuntimeException("User not found with id: " + email));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
