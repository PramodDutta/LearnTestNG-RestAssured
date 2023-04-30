package com.thetestingacademy._practice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

public class Ser {

    @Test
    public void SerTest() throws JsonProcessingException {

        Employee employee = new Employee();
        employee.setFirstname("Pramod");
        employee.setLastname("Dutta");
        employee.setAge("30");
        employee.setGender("Male");
        employee.setSalary(32);

        ObjectMapper mapper = new ObjectMapper();
        String jsonPayload = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
        System.out.println(jsonPayload);


    }
}
