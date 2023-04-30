package com.thetestingacademy.restassured.crud.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDDStyle {


    @Test
    public void getAllBookingIds(){
            //GET Request to https://restful-booker.herokuapp.com/booking

        RequestSpecification r = RestAssured.given(); // Pre script
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking");
        r.when().get();
        r.then().statusCode(200);



    }


}
