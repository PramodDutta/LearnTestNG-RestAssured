package com.thetestingacademy.restassured.payloadManage;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class payloadDemo {

    @Test
    public void payloadManager(){
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");

//        String paylaod = "{\n" +
//                "    \"username\" : \"admin\",\n" +
//                "    \"password\" : \"password123\"\n" +
//                "}";

//        Map<String,String> paylaod = new HashMap<>();
//        paylaod.put("username","admin");
//        paylaod.put("password","password123");


        Auth paylaod = new Auth();
        paylaod.setUsername("admin");
        paylaod.setPassword("password123");


        r.contentType(ContentType.JSON);
        r.body(paylaod);
        Response response = r.post();
        System.out.println(response.then().log().all());



    }

    class Auth{
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        String username;

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        String password;


    }
}
