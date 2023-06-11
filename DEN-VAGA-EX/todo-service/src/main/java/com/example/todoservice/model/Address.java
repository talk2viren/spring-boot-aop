package com.example.todoservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    public String street;
    public String suite;
    public String city;
    public String zipcode;
    public Geo geo;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Geo{
    public String lat;
    public String lan;
}
