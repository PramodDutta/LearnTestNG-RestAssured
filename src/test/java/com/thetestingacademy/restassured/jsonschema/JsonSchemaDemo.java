package com.thetestingacademy.restassured.jsonschema;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

import java.io.File;

import static io.restassured.RestAssured.given;

public class JsonSchemaDemo {

    public static void main(String[] args) {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts/2";

        //obtain response
        given()
                .when().get()
                //verify JSON Schema
                .then().assertThat()
                .body(JsonSchemaValidator.
                        matchesJsonSchema(new File("src/test/java/resource/schema.json")));


    }
}
