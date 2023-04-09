package com.tc.todo.facade.impl;

import com.tc.todo.entities.Todo;
import com.tc.todo.entities.User;
import com.tc.todo.facade.TodoFacade;
import com.tc.todo.services.TodoService;
import com.tc.todo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Component
@RequiredArgsConstructor
public class TodoFacadeImpl implements TodoFacade {

    private final TodoService todoService;
    private final UserService userService;

    @Override
    public void deleteTodo(Integer userId, Integer todoId) {

    }

    @Override
    public void add(Integer userId, Todo todo) {
        todo.setCreatedTime(LocalDateTime.now());
        Todo savedTodo = todoService.create(todo);
        User user = userService.getById(userId);
        if(CollectionUtils.isEmpty(user.getTodos())){
            user.setTodos(new ArrayList<>());
        }
        user.getTodos().add(savedTodo);
        userService.create(user);
    }
}
