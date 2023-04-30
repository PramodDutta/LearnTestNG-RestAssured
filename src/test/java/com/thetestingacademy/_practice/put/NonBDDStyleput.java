package com.thetestingacademy._practice.put;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class NonBDDStyleput {

    @Test
    public void nonBDDStyle(){

        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com/");
        r.basePath("booking/10972");
        r.cookie("token","163b94733cbfca7");
        Response response = r.delete();
        ValidatableResponse vr = response.then().log().all();
        vr.statusCode(405);
//        vr.body("firstname", Matchers.equalTo("Pramod"));

    }


}
