package com.thetestingacademy.restassured.pojo.JSONArray;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thetestingacademy.restassured.pojo.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class POJOJSONArrayDemo {
    public static void main(String[] args) throws JsonProcessingException {
        Employee pramod = new Employee();
        pramod.setFirstName("Pramod");
        pramod.setLastName("Dutta");
        pramod.setAge(31);
        pramod.setGender("Male");
        pramod.setSalary(199.56);
        pramod.setMarried(false);

        // Create second employee
        Employee employee = new Employee();
        employee.setFirstName("employee");
        employee.setLastName("employee");
        employee.setAge(320);
        employee.setGender("Male");
        employee.setSalary(230000.56);
        employee.setMarried(true);

        // Create third employee
        Employee employee1 = new Employee();
        employee1.setFirstName("Kriti");
        employee1.setLastName("Ji");
        employee1.setAge(27);
        employee1.setGender("Female");
        employee1.setSalary(30000.56);
        employee1.setMarried(false);

        // Creating a List of Employees
        List<Employee> allEMployees = new ArrayList<Employee>();
        allEMployees.add(pramod);
        allEMployees.add(employee);
        allEMployees.add(employee1);

        ObjectMapper objectMapper = new ObjectMapper();
        String allEmployeeJSON = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(allEMployees);
        System.out.println(allEmployeeJSON);


        // GET POJOFrom Employees

        ObjectMapper objectMapper1 = new ObjectMapper();
        List<Employee> allEmployDetails = objectMapper.readValue(allEmployeeJSON, new TypeReference<List<Employee>>() {

        });
        for (Employee emp : allEmployDetails) {
            System.out.println("========================================================");
            System.out.println("First Name of employee : " + emp.getFirstName());
            System.out.println("Last Name of employee : " + emp.getLastName());
            System.out.println("Age of employee : " + emp.getAge());
            System.out.println("Gender of employee : " + emp.getGender());
            System.out.println("Salary of employee : " + emp.getSalary());
            System.out.println("Marital status of employee : " + emp.getMarried());
            System.out.println("========================================================");
        }


    }
}
