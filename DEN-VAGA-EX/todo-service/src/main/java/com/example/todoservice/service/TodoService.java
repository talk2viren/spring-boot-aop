package com.example.todoservice.service;

import com.example.todoservice.exceptions.MyException;
import com.example.todoservice.model.Todo;
import com.example.todoservice.repository.TodoRepository;
import jakarta.transaction.TransactionScoped;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Slf4j
@Service
@TransactionScoped
@Transactional
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Transactional
    public List<Todo> findAll(){
        System.out.println("Print 1");
        System.out.println("Print 2");
        System.out.println("Print 3");
        System.out.println("Print 4");
        return todoRepository.findAll();
    }


}
