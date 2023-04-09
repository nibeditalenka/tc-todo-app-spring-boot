package com.tc.todo.services.impl;

import com.tc.todo.entities.User;
import com.tc.todo.repositories.UserRepository;
import com.tc.todo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public void create(User user) {
        userRepository.save(user);
    }

    @Override
    public User getById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }
}
