package com.springboot.usersystemmanagiment.service;

import com.springboot.usersystemmanagiment.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User saveUser(User user);

    User getUserByID(Long id);
    User updateUser(User user);
    void deleteUserByID(Long id);
}
