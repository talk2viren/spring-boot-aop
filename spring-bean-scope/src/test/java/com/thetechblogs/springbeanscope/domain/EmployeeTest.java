package com.thetechblogs.springbeanscope.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeTest {

    	@Test
	void contextLoads() {
	}

    @Test
    private void compareEmployees(){
        System.out.println("test");
//        https://stackoverflow.com/questions/6720236/sort-an-arraylist-of-objects-by-last-name-then-first-name
        Employee employee1= new Employee(1,"Virendra","Sharma");
        Employee employee2= new Employee(2,"Preeti","yadav");
//        return playerList.stream().sorted(Comparator.comparing(PlayerStats::getPlayerLastName).thenComparing(PlayerStats::getPlayerFirstName)).collect(Collectors.toList());
//        C
    }
}
