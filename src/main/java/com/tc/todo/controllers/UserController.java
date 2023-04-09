package com.tc.todo.controllers;

import com.tc.todo.entities.Todo;
import com.tc.todo.entities.User;
import com.tc.todo.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 *  signup, login,
 */
@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {
    private final UserFacade userFacade;

    @PostMapping("signup")
    public void signup(@RequestBody User user){
        userFacade.create(user);
    }

    @GetMapping("{id}/todos")
    public List<Todo> getAll(@PathVariable Integer id){
        return userFacade.getTodos(id);
    }

}

