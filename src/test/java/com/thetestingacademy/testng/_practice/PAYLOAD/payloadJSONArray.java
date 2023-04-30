package com.thetestingacademy.testng._practice.PAYLOAD;

import com.google.gson.JsonArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class payloadJSONArray {

    public static void main(String[] args) {

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
        jsonBodyUsingMap.put("firstname", "Pramod");
        jsonBodyUsingMap.put("lastname", "Dutta");
        jsonBodyUsingMap.put("totalprice", 111);
        jsonBodyUsingMap.put("depositpaid", true);

        Map<String, String> bookingDatesMap2 = new HashMap<>();
        bookingDatesMap.put("checkin", "2021-07-01");
        bookingDatesMap.put("checkout", "2021-07-01");

        jsonBodyUsingMap.put("bookingdates", bookingDatesMap);
        jsonBodyUsingMap.put("additionalneeds", "Breakfast");

        ArrayList<Map<String,Object>> payload = new ArrayList<>();
        payload.add(jsonBodyUsingMap);
        payload.add(jsonBodyUsingMap2);







    }
}
