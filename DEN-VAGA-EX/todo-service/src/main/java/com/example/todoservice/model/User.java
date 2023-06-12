package com.example.todoservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {

    private String id;
    private String name;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

}
