package com.example.todoservice;

import org.aspectj.lang.annotation.Before;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableTransactionManagement
public class TodoServiceApplication {

    private final String BASE_URL = "https://jsonplaceholder.typicode.com";

    @Bean
    public WebClient getWebClient(){
        return WebClient.builder().baseUrl(BASE_URL).build();
    }


    public static void main(String[] args) {
        SpringApplication.run(TodoServiceApplication.class, args);
    }


//    CommandLineRunner commandLineRunner(JsonPlaceHolderService placeHolderService, TodoService todoService){
//
//    }

}
