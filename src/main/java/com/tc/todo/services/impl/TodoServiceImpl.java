package com.tc.todo.services.impl;

import com.tc.todo.entities.Todo;
import com.tc.todo.repositories.TodoRepository;
import com.tc.todo.services.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {
    private final TodoRepository todoRepository;
    @Override
    public Todo create(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public void deleteTodo(Integer todoId) {

    }
}
