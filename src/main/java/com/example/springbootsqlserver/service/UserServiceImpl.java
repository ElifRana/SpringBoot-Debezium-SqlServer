package com.example.springbootsqlserver.service;

import com.example.springbootsqlserver.model.User;
import com.example.springbootsqlserver.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public User getUser(int id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(int id, User user) {

        User newUser = userRepository.findById(id).orElseThrow();
        newUser.setName(user.getName());
        return userRepository.save(newUser);
    }

    @Override
    public void deleteUser(int id) {
        User user = userRepository.findById(id).orElseThrow();
        userRepository.delete(user);
    }

    @Override
    public List<User> allUser() {
        return userRepository.findAll();
    }
}
