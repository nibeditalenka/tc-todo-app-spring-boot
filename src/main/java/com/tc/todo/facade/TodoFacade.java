package com.tc.todo.facade;

import com.tc.todo.entities.Todo;

import java.util.List;

public interface TodoFacade {
    void deleteTodo(Integer userId, Integer todoId);

    void add(Integer userId, Todo todo);
}
