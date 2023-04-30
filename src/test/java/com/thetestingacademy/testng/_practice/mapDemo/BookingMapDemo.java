package com.thetestingacademy.testng._practice.mapDemo;

import java.util.HashMap;
import java.util.Map;

public class BookingMapDemo {

    public static void main(String[] args) {

            /**
             * {
             *     "firstname" : "James",
             *     "lastname" : "Brown",
             *     "totalprice" : 111,
             *     "depositpaid" : true,
             *     "bookingdates" : {
             *         "checkin" : "2018-01-01",
             *         "checkout" : "2019-01-01"
             *     },
             *     "additionalneeds" : "Breakfast"
             * }
             *
             * **/

        HashMap<String,Object> firstpayload = new HashMap<>();
        firstpayload.put("firstname","James");
        firstpayload.put("lastname","Dutta");
        firstpayload.put("totalprice",111);
        firstpayload.put("depositpaid",true);
        firstpayload.put("additionalneeds","Breakfast");

        HashMap<String,String> bookingdates = new HashMap<>();
        bookingdates.put("checkin","2018-01-01");
        bookingdates.put("checkout","2019-01-01");
        firstpayload.put("bookingdates",bookingdates);

        for(Map.Entry<String,Object> e: firstpayload.entrySet()){
            System.out.println(e.getKey() +" - "+ e.getValue());
        }








    }
}
