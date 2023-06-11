package com.example.todoservice.controller;

import com.example.todoservice.TodoServiceApplication;
import com.example.todoservice.model.Todo;
import com.example.todoservice.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    public TodoService service;

    public List<Todo> findAll(){
//        return service.
        return null;
    }


}
