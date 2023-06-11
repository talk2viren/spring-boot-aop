package com.thetechblogs.springbeanscope.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {

    public int employeeId;
    public String firstName;
    public String lastName;

}
