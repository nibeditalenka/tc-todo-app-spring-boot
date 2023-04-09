package com.tc.todo.facade;

import com.tc.todo.entities.Todo;
import com.tc.todo.entities.User;

import java.util.List;

public interface UserFacade {
    void create(User user);

    List<Todo> getTodos(Integer id);
}
