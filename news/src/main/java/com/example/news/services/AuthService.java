package com.example.news.services;

import com.example.news.models.User;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class AuthService {
    private List<User> users = new ArrayList<>();
    private AtomicLong userIdCounter = new AtomicLong(1);

    public User registerUser(String name, String email, String password) {
        if (users.stream().anyMatch(u -> u.getEmail().equals(email))) {
            throw new RuntimeException("Пользователь с таким email уже существует");
        }

        User newUser = new User(
                UUID.randomUUID().toString(),
                name,
                email,
                password
        );
        users.add(newUser);
        return newUser;
    }

    public User login(String email, String password) {
        return users.stream()
                .filter(u -> u.getEmail().equals(email) && u.getPassword().equals(password))
                .findFirst()
                .orElse(null);
    }

    public List<User> getAllUsers() {
        return users;
    }

    public void deleteUser(String userId) {
        users.removeIf(u -> u.getId().equals(userId));
    }
}
