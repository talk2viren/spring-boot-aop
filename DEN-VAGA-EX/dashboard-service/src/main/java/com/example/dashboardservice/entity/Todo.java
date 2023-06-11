package com.example.dashboardservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TODO_TBL")
public class Todo {
    @Id
    private Integer id;
    private Integer userId;
    private String title;
    boolean completed;
    @Version
    private Integer version;

}
