package com.thetestingacademy.restassured.payloadManage.usingMap;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class PayloadManagerMapJSONObject {

    @Test
    public void payloadManager(){
        //{
        //            "firstname" : "Jim",
        //                "lastname" : "Brown",
        //                "totalprice" : 111,
        //                "depositpaid" : true,
        //                "bookingdates" : {
        //            "checkin" : "2018-01-01",
        //                    "checkout" : "2019-01-01"
        //        },
        //            "additionalneeds" : "Breakfast"
        //        }

        Map<String,Object> jsonBodyUsingMap = new HashMap<String,Object>();
        jsonBodyUsingMap.put("firstname", "Jim");
        jsonBodyUsingMap.put("lastname", "Brown");
        jsonBodyUsingMap.put("totalprice", 111);
        jsonBodyUsingMap.put("depositpaid", true);

        Map<String,String> bookingDatesMap = new HashMap<>();
        bookingDatesMap.put("checkin", "2021-07-01");
        bookingDatesMap.put("checkout", "2021-07-01");

        jsonBodyUsingMap.put("bookingdates", bookingDatesMap);
        jsonBodyUsingMap.put("additionalneeds", "Breakfast");


    }

}
