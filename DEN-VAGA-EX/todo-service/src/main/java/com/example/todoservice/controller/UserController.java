package com.example.todoservice.controller;

import com.example.todoservice.model.Todo;
import com.example.todoservice.model.UserEntity;
import com.example.todoservice.repository.TodoRepository;
import com.example.todoservice.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserEntityRepository userEntityRepository;

    @Autowired
    private TodoRepository todoRepository;
    @PostMapping("/createUser")
    public UserEntity createUser(@RequestBody UserEntity userEntity){
        return userEntityRepository.save(userEntity);
    }

    @PostMapping("/createTodo")
    public Todo createUser(@RequestBody Todo todo){
        return todoRepository.save(todo);
    }
}
