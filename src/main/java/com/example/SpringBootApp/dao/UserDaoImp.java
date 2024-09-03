package com.example.SpringBootApp.dao;

import com.example.SpringBootApp.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> findAll() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    public User findById(long id){
        return entityManager.find(User.class, id);
    }

    @Override
    public void save(User user) {
        entityManager.merge(user);
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteById(long id) {
        entityManager.remove(findById(id));
    }


}