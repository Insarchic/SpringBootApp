package com.example.SpringBootApp.service;

import com.example.SpringBootApp.model.User;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface UserService {
    List<User> findAll();

    User findById(long id);

    void save(User user);

    void update(User user);

    void deleteById(long id);
}
