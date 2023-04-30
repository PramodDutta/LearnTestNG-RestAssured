package com.thetestingacademy.testng._practice;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;


import static io.restassured.RestAssured.*;

public class RADemo {

    public static void main(String[] args) {

        // Given - Pre Request baseURI, headers, Param, Auth, BasePath

        RequestSpecification requestSpecification = given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");




        RestAssured.given(requestSpecification);







    }


}
