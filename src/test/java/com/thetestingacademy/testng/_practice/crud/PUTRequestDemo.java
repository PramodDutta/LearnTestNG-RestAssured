package com.thetestingacademy.testng._practice.crud;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class PUTRequestDemo {

    /**
     * 1. POST Request to get the Token.
     * 2. We have to set the Token to the Request of PUTRequest
     * **/
    String token;
    RequestSpecification rs;
    Response response;
    ValidatableResponse validatableResponse;

    @Test(priority = 0)
    public void getToken(){

//        String payload = "{\n" +
//                "    \"username\" : \"admin\",\n" +
//                "    \"password\" : \"password123\"\n" +
//                "}";

//        HashMap<String,String> payload =  new HashMap<>();
//        payload.put("username","admin");
//        payload.put("password","password123");

        Auth authPayload = new Auth();
        authPayload.setUsername("admin");
        authPayload.setPassword("password123");

        Auth authResponse = new Auth();
        authResponse.setUsername("dasda");
        authResponse.setPassword("dasda");

        rs = RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com/");
        rs.basePath("auth");
        rs.contentType(ContentType.JSON);
        rs.body(authPayload);
        response = rs.post();
        validatableResponse = response.then();
        validatableResponse.body("token", Matchers.notNullValue());
        token =  response.then().log().all().extract().path("token");
        System.out.println("Your Token is "+token);

    }


    @Test(priority = 1)
    public void makePutRequest(){
        HashMap<String,Object> firstpayload = new HashMap<>();
        firstpayload.put("firstname","James");
        firstpayload.put("lastname","Dutta");
        firstpayload.put("totalprice",111);
        firstpayload.put("depositpaid",true);
        firstpayload.put("additionalneeds","Breakfast");

        HashMap<String,String> bookingdates = new HashMap<>();
        bookingdates.put("checkin","2018-01-01");
        bookingdates.put("checkout","2019-01-01");
        firstpayload.put("bookingdates",bookingdates);

        for(Map.Entry<String,Object> e: firstpayload.entrySet()){
            System.out.println(e.getKey() +" - "+ e.getValue());
        }

        rs = RestAssured.given();
        rs.contentType(ContentType.JSON);
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("booking/6227");
        rs.cookie("token",token);
        rs.body(firstpayload);
        response = rs.put();
        validatableResponse = response.then().log().all();
        validatableResponse.body("firstname",Matchers.equalTo("Vinay"));
        validatableResponse.body("lastname",Matchers.equalTo("Brown"));
        validatableResponse.time(Matchers.lessThan(5000L));




    }





}
