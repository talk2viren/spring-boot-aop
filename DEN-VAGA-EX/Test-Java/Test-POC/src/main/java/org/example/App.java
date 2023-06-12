package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
//    @SuppressWarnings
    public static void main( String[] args )
    {
        String json = "[{\"name\":\"John\",\"age\":30},{\"name\":\"Jane\",\"age\":25}]";

        ObjectMapper objectMapper = new ObjectMapper();

        TypeReference<List<Person>> typeRef = new TypeReference<List<Person>>() {};

        List<Person> persons = objectMapper.readValue(json, typeRef);

        for (Person person : persons) {
            System.out.println(person.getName() + " - " + person.getAge());
        }


    }
}
