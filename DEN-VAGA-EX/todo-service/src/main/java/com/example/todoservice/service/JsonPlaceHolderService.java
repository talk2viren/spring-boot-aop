package com.example.todoservice.service;

import com.example.todoservice.model.Todo;
import com.example.todoservice.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class JsonPlaceHolderService {

    @Autowired
    public  WebClient webClient;

    public List<Todo> getTodos() {

        List<Todo> todos=webClient.get().uri("/todos").retrieve().bodyToMono(new ParameterizedTypeReference<List<Todo>>() {
        }).block();

//        todos.stream().collect(Collectors.groupingBy(a -> a.getUserId()));

        return todos;
    }


    public List<User> getUsers() {
        List<User> users = webClient.get().uri("/users").retrieve().bodyToMono(new ParameterizedTypeReference<List<User>>() {
        }).block();

        return users;
    }

}
