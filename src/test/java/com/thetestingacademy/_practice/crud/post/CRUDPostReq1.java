package com.thetestingacademy._practice.crud.post;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;

public class CRUDPostReq1 {
    public static void main(String[] args) {

        // url
        // payload
        // header - content Type - json
        // post method -
        // validate the status 200

        String payload = "{\n" +
                "    \"firstname\" : \"Pramod\",\n" +
                "    \"lastname\" : \"Dutta\",\n" +
                "    \"totalprice\" : 432,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2022-01-01\",\n" +
                "        \"checkout\" : \"2022-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";


        // BDDStyle

        // 1. Make the Request

        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        Integer id = 3050;
        r.basePath("/booking"+id);
        r.contentType(ContentType.JSON);
        r.body(payload);
        Response response = r.when().put();
        // data

        System.out.println(response.asString());

        // 2. Validate the Response


        ValidatableResponse vr = response.then();
        // TC#1 - Status code 200
        vr.statusCode(200);
        // TC#2  - bookingId should not be null
        vr.body("bookingid", Matchers.notNullValue());
        // TC 3,4,5,6,7,8, 10....

        // TestNG
        // Hamcrest
        // AssertJ



        // Rest Assured -> HTTP Client -> CURL Request
             // <----  , ->> curl

        // Make a Request + Validation also (hamcrest assertion)
        // Validation - Body, Headers, and StatusCode









    }
}
