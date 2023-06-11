package com.example.todoservice.service;

import aj.org.objectweb.asm.TypeReference;
import com.example.todoservice.model.Todo;
import com.example.todoservice.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

@Service
@Slf4j
public class JsonPlaceHolderService {
    private final String TODO_API_URL = "https://jsonplaceholder.typicode.com/todos";
    private final String URERS_URL="https://jsonplaceholder.typicode.com/users";

//    @Autowired
    public WebClient webClient = WebClient.builder().build();;


    public List<User> getUsers(){
        User[] users = webClient.get().uri(URERS_URL).retrieve().bodyToMono(User[].class).block();
        System.out.println("Unsorted object");

        Arrays.stream(users).forEach(user -> System.out.println(user));

        for(User user : users){
            Function<User,String> byFirstName=User::getName;
            Function<User,String> byEmail=User::getEmail;

            Comparator<User> lastThenFirst=Comparator.comparing(byFirstName).thenComparing(byEmail);
        }

        System.out.println("Sorted objects");
        Arrays.stream(users).forEach(user -> System.out.println(user));

        return null;
    }



    public List<Todo> getTodoList(){

        Todo[] todos = webClient.get().uri(TODO_API_URL).retrieve().bodyToMono(Todo[].class).block();
//       Todo[] todos = webClient.get().uri(TODO_API_URL).retrieve().bodyToMono(new com.fasterxml.jackson.core.type.TypeReference<List<Todo>>(){}).block();
//       List<Todo> myObjects = objectMapper.readValue(json, new TypeReference<List<Todo>>() {});

        for(Todo todo:todos){


            log.info(todo.toString());
        }
       log.info("My Response : "+todos);

        return null;
//        ResponseEntity
    }

    public static void main(String[] args) {
        new JsonPlaceHolderService()
                .getUsers();
    }

}
