package com.thetestingacademy._practice.crud.post;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NonBDDStyle {

    String payload = "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    @BeforeTest
    void setUp(){
        requestSpecification = RestAssured.given();;
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/auth/23");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload);
        response = requestSpecification.put();
        validatableResponse = response.then().log().all();
    }

    @Test
    void postNonBDD(){
        // Post request is done ->  Response  {} json with Token
        validatableResponse.body("token", Matchers.notNullValue());
    }


     @Test
     void postNonBDD2(){
         // Post request is done ->  Response  {} json with Token
         validatableResponse.body("token.length()",Matchers.is(15));
     }


}
