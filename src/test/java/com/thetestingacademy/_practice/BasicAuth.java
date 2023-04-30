package com.thetestingacademy._practice;

import io.restassured.RestAssured;

public class BasicAuth {
    public static void main(String[] args) {

        RestAssured.baseURI = "https://the-internet.herokuapp.com";
        RestAssured.basePath= "/basic_auth";
        /// 0Auth2.0 -> key
        RestAssured.given().auth().oauth2("key").when().get().then().log().all();

    }
}
