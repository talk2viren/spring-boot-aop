package com.example.todoservice.configuration;

import com.example.todoservice.model.Todo;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class BeanConfig {

    @Bean(name = "myTodo")
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public Todo myTodo(){
        return new Todo(1,3,"title",true,1);
    }

}
