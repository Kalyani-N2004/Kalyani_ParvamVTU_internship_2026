package com.kalyani.finance.service;

import com.kalyani.finance.entity.User;
import com.kalyani.finance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // =========================
    // REGISTER USER
    // =========================
    public String saveUser(User user) {

        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            return "Email already registered!";
        }

        userRepository.save(user);
        return "Registration Successful!";
    }

    // =========================
    // LOGIN USER
    // =========================
    public User loginUser(String email, String password) {

        Optional<User> user = userRepository.findByEmail(email);

        if (user.isPresent() && user.get().getPassword().equals(password)) {
            return user.get();
        }

        return null;
    }

    // =========================
    // UPDATE USER (USED FOR BUDGET)
    // =========================
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    // =========================
    // GET USER BY EMAIL (OPTIONAL USEFUL)
    // =========================
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}