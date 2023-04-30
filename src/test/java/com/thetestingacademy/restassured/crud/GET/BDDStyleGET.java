package com.thetestingacademy.restassured.crud.GET;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class BDDStyleGET {

    @Test
    public void BDDStyleGET(){
        // abc.con/pp/ppa?q=abc
        // baseURi - abc.con
        // pp= BasePath
        // ppa -> pathParams
        // q =abc -> queryParam


        // CRUD -  https://restful-booker.herokuapp.com
        // baePath, queryParam, pathParams


                given().baseUri("https://restful-booker.herokuapp.com").basePath("/booking")
                .when().get().
                then().statusCode(200);


                         // A a = new A()
                        //a.makeRequest();









        // RA- Given, Whn then - Prepare you Request.

        // RequestSpecification - Interface

        RequestSpecification r = RestAssured.given(); // Pre script
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking");
        r.when().get();
        r.then().statusCode(200);


    }
}
