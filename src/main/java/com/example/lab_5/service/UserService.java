package com.example.lab_5.service;

import com.example.lab_5.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);
}
