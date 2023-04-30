package com.thetestingacademy._practice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

public class DeSer {


    @Test
    public void DeSerTest() throws JsonProcessingException {

            String jsonResponse = "{\n" +
                    "        \"firstname\" : \"Pramod\",\n" +
                    "        \"lastname\" : \"Dutta\",\n" +
                    "        \"age\" : \"contact@thetestingacademy.com\",\n" +
                    "        \"gender\" : \"Male\",\n" +
                    "        \"salary\" : 20,\n" +
                    "        \"married\" : true\n" +
                    "}";

        ObjectMapper mapper = new ObjectMapper();
        Employee employee = mapper.readValue(jsonResponse,Employee.class);
        System.out.println(employee.getFirstname());
        System.out.println(employee.getAge());






    }
}
