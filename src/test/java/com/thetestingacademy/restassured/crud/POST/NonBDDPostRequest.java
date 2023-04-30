package com.thetestingacademy.restassured.crud.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class NonBDDPostRequest {

    @Test
    public void NonBDDStylePOSTRequest(){


        // =-----------------   PRE Request Step 1
        // Payload
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/auth");
        requestSpecification.contentType(ContentType.JSON);



        requestSpecification.body(payload);


        // =-----------------  Making Request Step 2

        Response response = requestSpecification.post();

        // =-----------------  Validation & Testing Step 3

        ValidatableResponse validatableResponse = response.then();
        String responseString= response.asString();

        validatableResponse.body("token", Matchers.notNullValue());
        validatableResponse.body("token.length()",Matchers.is(15));







    }
}
