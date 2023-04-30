package com.thetestingacademy.restassured.payloadManage.usingMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayloadManagerMapJSONArray {

    @Test
    public void payloadManager() {
//             [{
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


        Map<String, Object> jsonBodyUsingMap = new HashMap<String, Object>();
        jsonBodyUsingMap.put("firstname", "Jim");
        jsonBodyUsingMap.put("lastname", "Brown");
        jsonBodyUsingMap.put("totalprice", 111);
        jsonBodyUsingMap.put("depositpaid", true);

        Map<String, String> bookingDatesMap = new HashMap<>();
        bookingDatesMap.put("checkin", "2021-07-01");
        bookingDatesMap.put("checkout", "2021-07-01");

        jsonBodyUsingMap.put("bookingdates", bookingDatesMap);
        jsonBodyUsingMap.put("additionalneeds", "Breakfast");

        Map<String, Object> jsonBodyUsingMap2 = new HashMap<String, Object>();
        jsonBodyUsingMap2.put("firstname", "Jim");
        jsonBodyUsingMap2.put("lastname", "Brown");
        jsonBodyUsingMap2.put("totalprice", 111);
        jsonBodyUsingMap2.put("depositpaid", true);

        Map<String, String> bookingDatesMap2 = new HashMap<>();
        bookingDatesMap2.put("checkin", "2021-07-01");
        bookingDatesMap2.put("checkout", "2021-07-01");

        jsonBodyUsingMap2.put("bookingdates", bookingDatesMap);
        jsonBodyUsingMap2.put("additionalneeds", "Breakfast");

         List<Map<String,Object>> mylist = new ArrayList<Map<String, Object>>();
         mylist.add(jsonBodyUsingMap);
         mylist.add(jsonBodyUsingMap2);

        //GIVEN
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com/booking")
                .contentType(ContentType.JSON)
                .body(mylist)
                .log()
                .all()
                // WHEN
                .when()
                .post()
                // THEN
                .then()
                .assertThat()
                // Asserting status code as 500 as it does not accept json array payload
                .statusCode(500)
                .log()
                .all();



    }

}
