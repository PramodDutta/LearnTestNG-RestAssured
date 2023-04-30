package com.thetestingacademy.restassured.jacksonapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationJavaToJSON {

    public static void main(String[] args) throws JsonProcessingException {
        Employee employeeObject = new Employee();
        employeeObject.setFirstName("Pramod");
        employeeObject.setLastName("Dutta");
        employeeObject.setAge(31);
        employeeObject.setSalary(2387.37);
        employeeObject.setMarried(false);
        employeeObject.setGender("M");


        ObjectMapper objectMapper = new ObjectMapper();
        String convertedJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employeeObject);
        System.out.println(convertedJson);

    }
}
