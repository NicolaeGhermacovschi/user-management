package com.springboot.usersystemmanagiment.service.imp;

import com.springboot.usersystemmanagiment.entity.User;
import com.springboot.usersystemmanagiment.repository.UserRepository;
import com.springboot.usersystemmanagiment.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImp implements UserService {
    private UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserByID(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserByID(Long id) {
        userRepository.deleteById(id);
    }
}
