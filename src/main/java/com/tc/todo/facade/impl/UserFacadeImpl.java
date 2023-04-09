package com.tc.todo.facade.impl;

import com.tc.todo.entities.Todo;
import com.tc.todo.entities.User;
import com.tc.todo.facade.UserFacade;
import com.tc.todo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserFacadeImpl implements UserFacade {
    private final UserService userService;
    @Override
    public void create(User user) {
        userService.create(user);
    }

    @Override
    public List<Todo> getTodos(Integer id) {
        User user = userService.getById(id);
        return user.getTodos();
    }
}
