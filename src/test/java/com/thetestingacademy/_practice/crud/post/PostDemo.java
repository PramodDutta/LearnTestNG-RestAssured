package com.thetestingacademy._practice.crud.post;

import com.thetestingacademy.restassured.crud.GET.NonBDDStyle;
import com.thetestingacademy.restassured.payloadManage.usingMap.AuthPost;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PostDemo {
    public static void main(String[] args) {

        // NonBDDStyle
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com/");

        // Auth to get Token
        // String
        String payloadAuth = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        // Hashmap
        Map<String,String> payloadMap = new HashMap();
       // Map<String,String> payloadMap2 = new LinkedHashMap<>(); // Orders Matters
        // Map ->  InputStream -> GSON /Jackson API

        payloadMap.put("username","admin");
        payloadMap.put("password","password123");




        // Object
        AuthPost authPost = new AuthPost();
        authPost.setUsername("admin");
        authPost.setPassword("password123");

        System.out.println(authPost);





        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(authPost);

        Response response = r.when().post();
        ValidatableResponse vr = response.then().log().all();
        // TC # 1
        vr.statusCode(200);
        // Extract the Token
        String token = response.then().extract().path("token");
        System.out.println(token);







//
//        // Post Requests
//        String payloadPostRequest = "{\n" +
//                "    \"firstname\" : \"Pramod\",\n" +
//                "    \"lastname\" : \"Brown\",\n" +
//                "    \"totalprice\" : 111,\n" +
//                "    \"depositpaid\" : true,\n" +
//                "    \"bookingdates\" : {\n" +
//                "        \"checkin\" : \"2018-01-01\",\n" +
//                "        \"checkout\" : \"2019-01-01\"\n" +
//                "    },\n" +
//                "    \"additionalneeds\" : \"Breakfast\"\n" +
//                "}";
//
//        r.basePath("booking");
//        r.cookie("token",token);
//        r.body(payloadPostRequest);
//
//        response = r.post();
//        vr = response.then().log().all();
//        // #TC 1
//        vr.statusCode(200);
//        Integer bookingId = response.then().extract().path("bookingid");
//
//
//
//        // Put Requests
//
//        String payloadPutRequest = "{\n" +
//                "    \"firstname\" : \"James\",\n" +
//                "    \"lastname\" : \"Brown\",\n" +
//                "    \"totalprice\" : 111,\n" +
//                "    \"depositpaid\" : true,\n" +
//                "    \"bookingdates\" : {\n" +
//                "        \"checkin\" : \"2018-01-01\",\n" +
//                "        \"checkout\" : \"2019-01-01\"\n" +
//                "    },\n" +
//                "    \"additionalneeds\" : \"Breakfast\"\n" +
//                "}";
//
//
//        r.basePath("booking/"+bookingId);
//        r.cookie("token",token);
//        r.body(payloadPutRequest);
//
//        response = r.put();
//        vr = response.then().log().all();
//        // #TC 1
//        vr.statusCode(200);
//        // TC# 2
//        // "firstname": "James",
//        vr.body("firstname", Matchers.equalTo("James"));
//
//
//        // id, delete method, token
//
//        r.basePath("booking/"+bookingId);
//        r.cookie("token",token);
//
//        response = r.delete();
//        vr = response.then().log().all();
//        // #TC 1
//        vr.statusCode(201);

    }
}
