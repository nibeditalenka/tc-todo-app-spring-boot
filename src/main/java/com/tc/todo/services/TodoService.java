package com.tc.todo.services;

import com.tc.todo.entities.Todo;

import java.util.List;

public interface TodoService {
    Todo create(Todo todo);
    void deleteTodo(Integer todoId);
}
