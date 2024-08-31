package com.example.SpringBootApp.service;


import com.example.SpringBootApp.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    User getUser(Long id);

    List<User> getAllUsers();

    void deleteUser(Long id);
}
