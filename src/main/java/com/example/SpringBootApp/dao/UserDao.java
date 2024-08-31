package com.example.SpringBootApp.dao;



import com.example.SpringBootApp.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);

    User getUser(Long id);

    List<User> getAllUsers();

    void deleteUser(Long id);
}
