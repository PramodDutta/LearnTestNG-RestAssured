package com.thetestingacademy._practice.crud;

import com.thetestingacademy.restassured.crud.GET.NonBDDStyle;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;

public class putdemo {
    public static void main(String[] args) {

        // Make a Post request to the /auth - get Token and
        // pass the token to the put requests
        // id -> 576
        // make a put request with the token and validate the resposne

        // NonBDDStyle
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com/");



        // Auth to get Token
        String payloadAuth = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        // String
        // Object POJO / JSON File
        // Hashmap

        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payloadAuth);

        Response response = r.when().post();
        ValidatableResponse vr = response.then().log().all();
        // TC # 1
        vr.statusCode(200);
        // Extract the Token
        String token = response.then().extract().path("token");
        System.out.println(token);

        // Post Requests
        String payloadPostRequest = "{\n" +
                "    \"firstname\" : \"Pramod\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        r.basePath("booking");
        r.cookie("token",token);
        r.body(payloadPostRequest);

        response = r.post();
        vr = response.then().log().all();
        // #TC 1
        vr.statusCode(200);
        Integer bookingId = response.then().extract().path("bookingid");



        // Put Requests

        String payloadPutRequest = "{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";


        r.basePath("booking/"+bookingId);
        r.cookie("token",token);
        r.body(payloadPutRequest);

        response = r.put();
        vr = response.then().log().all();
        // #TC 1
        vr.statusCode(200);
        // TC# 2
        // "firstname": "James",
        vr.body("firstname", Matchers.equalTo("James"));


        // id, delete method, token

        r.basePath("booking/"+bookingId);
        r.cookie("token",token);

        response = r.delete();
        vr = response.then().log().all();
        // #TC 1
        vr.statusCode(201);

    }
}
