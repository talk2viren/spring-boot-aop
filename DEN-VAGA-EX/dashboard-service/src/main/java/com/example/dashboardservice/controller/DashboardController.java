package com.example.dashboardservice.controller;

import com.example.dashboardservice.entity.Todo;
import com.example.dashboardservice.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    @Autowired
    private TodoRepository todoRepository;

    @PostMapping("/todos")
    public void loadTodos(@RequestBody List<Todo> todo){
        todoRepository.saveAll(todo);
    }
}
