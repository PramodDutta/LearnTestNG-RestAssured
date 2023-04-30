package com.thetestingacademy.testng._practice.RequestSpecBuilder;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class RSB {


    @Test
    public void runRSB(){

        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri("https://restful-booker.herokuapp.com");
        requestSpecBuilder.setBasePath("/booking");
        requestSpecBuilder.addCookie("vwo=dasdadad");
        requestSpecBuilder.addHeader("auth","dasda");


        RequestSpecification r = requestSpecBuilder.build();





    }


}
