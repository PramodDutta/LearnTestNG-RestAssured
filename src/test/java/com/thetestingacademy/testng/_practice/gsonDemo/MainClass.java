package com.thetestingacademy.testng._practice.gsonDemo;

import com.google.gson.Gson;
import org.testng.annotations.Test;

public class MainClass {

//     {
//                "firstName" : "Pramod",
//                "lastName" : "Dutta",
//                "gender" : "M",
//                "age" : 31,
//                "salary" : 500.00,
//                "married" : false
//        }

    @Test
    public void SerializationTest()  {

        // Java -> JSON
        Employee employee = new Employee();
        employee.setFirstName("Pramod");
        employee.setLastName("Dutta");
        employee.setAge(30);
        employee.setSalary(1000.00);
        employee.setMarried(true);

        Gson gson = new Gson();
        String payload = gson.toJson(employee);
        System.out.println(payload);


    }

    @Test
    public void DeSerializationTest(){
        // JSON -> JAVA

        String json = "{\n" +
                "                \"firstName\" : \"Pramod\",\n" +
                "                \"lastName\" : \"Dutta\",\n" +
                "                \"gender\" : \"M\",\n" +
                "                \"age\" : 31,\n" +
                "                \"salary\" : 500.00,\n" +
                "                \"married\" : false\n" +
                "        }";

        Gson gson = new Gson();
        Employee employee = gson.fromJson(json,Employee.class);
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());

    }


}
