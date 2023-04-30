package com.thetestingacademy._practice.crud.post;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class BDDStylePostRequest {


    // Create a Method
    // Add an Annotation of Test for TestNG Framework @Test
    //  Post
    //  URl, enposint, HTTP Post Method
    // username and pasword -> Payload

    // Post -> URL and Auth , Headers, payload

    // urL
    // Base URI and Base Path
    //https://restful-booker.herokuapp.com/auth

    // Base Url ?  -> https://restful-booker.herokuapp.com
    // Base Path ? -> /auth

    // Payload -> JSON, Content-Type  -> JSON
    // In the Response Token should not be Null

            /*
            *
            * pm.test("Check Token is not null",function(){
    pm.expect(pm.response.json()["Token"]).not.to.be.null;
});
            *
            *
            * */

        @Test
        void postUserNameAndPassword(){

            String payload = "{\n" +
                    "    \"username\" : \"admin\",\n" +
                    "    \"password\" : \"password123\"\n" +
                    "}";

              RestAssured
                      .given().baseUri("https://restful-booker.herokuapp.com").basePath("/auth")
                      .contentType(ContentType.JSON)
                      .body(payload)
                      .when().post()
                      .then().log().all()
                      .body("token",Matchers.notNullValue());
        }

        @Test
        void post2(){
//            String payload = "{\n" +
//                    "    \"username\" : \"admin\",\n" +
//                    "    \"password\" : \"password123\"\n" +
//                    "}";

            PayloadClass payloadClass = new PayloadClass("admin","password123");

            RestAssured
                    .given().baseUri("https://restful-booker.herokuapp.com").basePath("/auth")
                    .contentType(ContentType.JSON)
                    .body(payloadClass)
                    .when().post()
                    .then().log().all()
                    .body("token.length()",Matchers.is(15));
        }



}
