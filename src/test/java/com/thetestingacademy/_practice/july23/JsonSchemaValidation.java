package com.thetestingacademy._practice.july23;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

import java.io.File;

import static io.restassured.RestAssured.given;

public class JsonSchemaValidation {

    public static void main(String[] args) {


        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts/2";

        given().log().all().when().get().then().
                assertThat().
                body(JsonSchemaValidator.matchesJsonSchema((new File("src/test/java/com/thetestingacademy/_practice/july23/Schema1.json"))));


    }
}
