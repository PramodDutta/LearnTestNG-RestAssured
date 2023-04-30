package com.thetestingacademy._practice.postCrud;

import com.google.gson.Gson;
import com.thetestingacademy._practice.postCrud.request.Booking;
import com.thetestingacademy._practice.postCrud.request.Bookingdates;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.sql.PreparedStatement;

public class RunnerClass {


    @Test
    public void postReq() {
        Booking booking = new Booking();
        booking.setFirstname("Pramod");
        booking.setLastname("Dutta");
        booking.setTotalprice(23);
        booking.setDepositpaid(true);
        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2022-09-01");
        bookingdates.setCheckout("2022-09-02");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

        Gson gson = new Gson();
        String bookingString = gson.toJson(booking);

        // De Serilizarion
        // Covert json String to Object ?

        Booking booking1 = gson.fromJson(bookingString,Booking.class);
        System.out.println(booking1.getFirstname());


//        String payload = "{\n" +
//                "    \"firstname\" : \"{{$randomFirstName}}\",\n" +
//                "    \"lastname\" : \"Dutta\",\n" +
//                "    \"totalprice\" : {{$randomInt}},\n" +
//                "    \"depositpaid\" : false,\n" +
//                "    \"bookingdates\" : {\n" +
//                "        \"checkin\" : \"{{$randomDateRecent}}\",\n" +
//                "        \"checkout\" : \"2022-01-01\"\n" +
//                "    },\n" +
//                "    \"additionalneeds\" : \"Lunch\"\n" +
//                "}";


        RestAssured.given().baseUri("https://restful-booker.herokuapp.com/")
                .basePath("/booking")
                .contentType(ContentType.JSON)
                .body(bookingString)
                .when().post()
                .then().log().all().assertThat().statusCode(200)
                .body("bookingid", Matchers.notNullValue())
                .body("bookingid.booking.firstname", Matchers.notNullValue());





    }

}
