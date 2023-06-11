package com.example.todoservice.service;

import com.example.todoservice.model.Todo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Slf4j
@Service
public class TodoService {

    @Autowired
    public WebClient webClient;


//    public List<Todo>(List<Todo> todos){
//        return webClient.get().uri("LOCALHOST").retrieve().bodyToMono(String.class).block();
//    }



}
