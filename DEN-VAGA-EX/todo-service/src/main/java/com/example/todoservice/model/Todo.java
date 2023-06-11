package com.example.todoservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Todo {
    @Id
    @NotNull
    private Integer id;
    @NotNull
    private Integer userId;
    private String title;
    boolean completed;
    @Version
    private Integer version;

}
