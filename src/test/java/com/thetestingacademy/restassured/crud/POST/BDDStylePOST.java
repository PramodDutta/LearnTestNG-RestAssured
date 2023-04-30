package com.thetestingacademy.restassured.crud.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class BDDStylePOST {

     @Test
    public void BDDStylePOSTRequest(){

         // Payload
         String payload = "{\n" +
                 "    \"username\" : \"admin\",\n" +
                 "    \"password\" : \"password123\"\n" +
                 "}";

         RestAssured.given().baseUri("https://restful-booker.herokuapp.com/")
                 .basePath("/auth")
                 .contentType(ContentType.JSON)
                 .body(payload)
                 .when().post()
                 .then().assertThat().statusCode(200)
                 .body("token", Matchers.notNullValue())
                 .body("token.length()", Matchers.is(15));

     }

}
