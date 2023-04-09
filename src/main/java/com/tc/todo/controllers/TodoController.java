package com.tc.todo.controllers;

import com.tc.todo.entities.Todo;
import com.tc.todo.facade.TodoFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * user specific always
 * add todo, update, delete, view all todos
 */
@RestController
@RequestMapping("todos")
@RequiredArgsConstructor
public class TodoController {

    private final TodoFacade todoFacade;

    /**
     * add todo
     * @param userId
     * @param todo
     */
    @PostMapping
    public void addTodo(@RequestParam Integer userId, @RequestBody Todo todo){
        todoFacade.add(userId, todo);
    }

    @DeleteMapping("/{todoId}")
    public void deleteTodo(@RequestParam Integer userId, @PathVariable Integer todoId){

    }
}
