package com.thetestingacademy._practice.put;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BBDStyle {


    //  Put
    // id ? - 10972
    // Url - https://restful-booker.herokuapp.com/booking/10972
    // Put requrest - Payload -
    //  Payload we have have
    // headers
    // Token - hard coded token
    // 163b94733cbfc

    // Test method of TestNg

    @Test
    public void BDDStylePutRequest() {


//         String payload = "{\n" +
//                 "    \"firstname\" : \"James\",\n" +
//                 "    \"lastname\" : \"Brown\",\n" +
//                 "    \"totalprice\" : 111,\n" +
//                 "    \"depositpaid\" : true,\n" +
//                 "    \"bookingdates\" : {\n" +
//                 "        \"checkin\" : \"2018-01-01\",\n" +
//                 "        \"checkout\" : \"2019-01-01\"\n" +
//                 "    },\n" +
//                 "    \"additionalneeds\" : \"Breakfast\"\n" +
//                 "}";

        // Hashmap ?  Key and Value


//     [{
//                    "firstname" : "Jim",
//                        "lastname" : "Brown",
//                        "totalprice" : 111,
//                        "depositpaid" : true,
//                        "bookingdates" : {
//                    "checkin" : "2018-01-01",
//                            "checkout" : "2019-01-01"
//                },
//                    "additionalneeds" : "Breakfast"
//                },
//               {"firstname" : "Pramod",
//                        "lastname" : "Dutta",
//                        "totalprice" : 111,
//                        "depositpaid" : true,
//                        "bookingdates" : {
//                    "checkin" : "2018-01-01",
//                            "checkout" : "2019-01-01"
//                },
//                    "additionalneeds" : "Breakfast"
//                }
//         ]


        HashMap<String, Object> payload = new HashMap<>();
        payload.put("firstname", "James");
        payload.put("lastname", "Brown");
        payload.put("totalprice", 111);
        payload.put("depositpaid", true);

        HashMap<String, String> bookingDates = new HashMap<>();
        bookingDates.put("checkin", "2018-01-01");
        bookingDates.put("checkout", "2019-01-01");

        payload.put("bookingdates", bookingDates);
        payload.put("additionalneeds", "Breakfast");


        HashMap<String, Object> payload2 = new HashMap<>();
        payload2.put("firstname", "Pramod");
        payload2.put("lastname", "Brown");
        payload2.put("totalprice", 111);
        payload2.put("depositpaid", true);

        HashMap<String, String> bookingDates2 = new HashMap<>();
        bookingDates2.put("checkin", "2018-01-01");
        bookingDates2.put("checkout", "2019-01-01");

        payload2.put("bookingdates", bookingDates2);
        payload2.put("additionalneeds", "Breakfast");

        System.out.println(payload2);


        HashMap<String, Object> payload3 = new HashMap<>();
        payload3.put("firstname", "Pramod");
        payload3.put("lastname", "Brown");
        payload3.put("totalprice", 111);
        payload3.put("depositpaid", true);

        HashMap<String, String> bookingDates3 = new HashMap<>();
        bookingDates3.put("checkin", "2018-01-01");
        bookingDates3.put("checkout", "2019-01-01");

        payload3.put("bookingdates", bookingDates3);
        payload3.put("additionalneeds", "Breakfast");

        System.out.println(payload3);


        ArrayList<Map<String,Object>> myList = new ArrayList<Map<String, Object>>();
        myList.add(payload);
        myList.add(payload2);
        myList.add(payload3);





//         RestAssured
//                 .given()
//                 .baseUri("https://restful-booker.herokuapp.com/")
//                 .basePath(("booking/15082"))
//                 .contentType(ContentType.JSON)
//                 .cookie("token","163b94733cbfca7")
//                 .body(payload) // String as payload, Hashmap as Payload and Class as Payload
//                 .when().put()
//                 .then().log().all()
//                 .statusCode(200)
//                 .body("firstname", Matchers.equalTo("James"))
//                 .body("lastname", Matchers.equalTo("Brown"))
//                 .body("bookingdates.checkin", Matchers.equalTo("2018-01-01"));

    }


}
