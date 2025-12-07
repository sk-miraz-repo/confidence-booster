package com.confidencebooster.backend.service;

import com.confidencebooster.backend.model.User;

import java.util.List;

public interface UserService {
    User registerUser(User user);
    User getUserById(Long id);
    User getUserByEmail(String email);
    List<User> getAllUsers();
}
