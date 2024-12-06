package ru.romiro.spring.dao;

import ru.romiro.spring.models.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);
    User getUser(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);

}