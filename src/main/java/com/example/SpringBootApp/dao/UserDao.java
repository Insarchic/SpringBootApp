package com.example.SpringBootApp.dao;

import com.example.SpringBootApp.model.User;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface UserDao {
    List<User> findAll();

    User findById(long id);

    void save(User user);

    void update(User user);

    void deleteById(long id);
}
