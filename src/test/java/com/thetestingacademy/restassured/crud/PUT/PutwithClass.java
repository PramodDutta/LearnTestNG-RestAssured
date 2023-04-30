package com.thetestingacademy.restassured.crud.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PutwithClass {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Employee employee;
    String token;

    @BeforeSuite
    public void preDataSetup() {
        employee = new Employee();
        employee.setFirstname("Pramod");
        employee.setLastname("Dutta");
        employee.setTotalprice(234);
        employee.setDepositpaid(true);
        Bookingdates dates = new Bookingdates();
        dates.setCheckin("2022-09-01");
        dates.setCheckout("2022-09-01");
        employee.setBookingdates(dates);
        employee.setAdditionalneeds("dads");
    }

    @BeforeTest
    public void setUp() {
        requestSpecification = RestAssured.given();
        Auth auth = new Auth();
        auth.setUsername("admin");
        auth.setPassword("password123");
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("auth");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(auth);
        Response response = requestSpecification.post();
        validatableResponse = response.then();
        validatableResponse.body("token", Matchers.notNullValue());
        validatableResponse.body("token.length()", Matchers.is(15));
        token = response.then().log().all().extract().path("token");
        System.out.println(token);


    }

    @Test
    public void NonBDDStylePOSTRequest() {

        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token", token);
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking/4848");
        requestSpecification.body(employee);
        Response response = requestSpecification.put();
        System.out.println(response.asString());
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);
        validatableResponse.body("firstname", Matchers.equalTo("Pramod"));
        validatableResponse.body("lastname", Matchers.equalTo("Dutta"));

    }
}
