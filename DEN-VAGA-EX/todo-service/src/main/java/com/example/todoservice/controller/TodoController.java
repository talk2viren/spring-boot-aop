package com.example.todoservice.controller;

import com.example.todoservice.TodoServiceApplication;
import com.example.todoservice.configuration.BeanConfig;
import com.example.todoservice.model.Todo;
import com.example.todoservice.service.JsonPlaceHolderService;
import com.example.todoservice.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    public TodoService todoService;

    @Autowired
    public BeanConfig beanConfig;

    @Autowired
    public JsonPlaceHolderService jsonService;

    @GetMapping("/getTodo")
    public ResponseEntity<List<Todo>> getTodo(){
        return new ResponseEntity<List<Todo>>(jsonService.getTodos(), HttpStatus.CREATED);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Todo>> findAll(){
        return new ResponseEntity<List<Todo>>(todoService.findAll(), HttpStatus.MULTI_STATUS);
    }

    @GetMapping("/getConfigTodo")
    public List<Todo> getConfigTodo(){
        return todoService.findAll();
    }


}
