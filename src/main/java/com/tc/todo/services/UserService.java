package com.tc.todo.services;

import com.tc.todo.entities.User;

public interface UserService {
    void create(User user);
    User getById(Integer id);
}
