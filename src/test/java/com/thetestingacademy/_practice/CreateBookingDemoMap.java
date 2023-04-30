//package com.thetestingacademy._practice;
//
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//import io.restassured.response.ValidatableResponse;
//import io.restassured.specification.RequestSpecification;
//
//import java.io.FileInputStream;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class CreateBookingDemoMap {
//
//    public static void main(String[] args) {
//
//        //  {
//        //            "firstname" : "Jim",
//        //                "lastname" : "Brown",
//        //                "totalprice" : 111,
//        //                "depositpaid" : true,
//        //                "bookingdates" : {
//        //            "checkin" : "2018-01-01",
//        //                    "checkout" : "2019-01-01"
//        //        },
//        //            "additionalneeds" : "Breakfast"
//        //        }
//
//        //{firstname=Jim, additionalneeds=Breakfast, bookingdates=
//        // {checkin=2018-01-01, checkout=2018-01-01}, totalprice=111, depositpaid=true, lastname=Brown}
//
//
//        // JSON Object -? MAP
//        // JSON Array -? ArrayList
//
//        // JSON -> map
//
//
////          [{
////            "firstname" : "Jim",
////                    "lastname" : "Brown",
////                    "totalprice" : 111,
////                    "depositpaid" : true,
////                    "bookingdates" : {
////                "checkin" : "2018-01-01",
////                        "checkout" : "2019-01-01"
////            },
////            "additionalneeds" : "Breakfast"
////        },
////        {"firstname" : "Pramod",
////                "lastname" : "Dutta",
////                "totalprice" : 111,
////                "depositpaid" : true,
////                "bookingdates" : {
////            "checkin" : "2018-01-01",
////                    "checkout" : "2019-01-01"
////        },
////            "additionalneeds" : "Breakfast"
////        }
////         ]
//
//
//    //    [
//        //    {firstname=Jim, additionalneeds=Breakfast, bookingdates={checkin=2018-01-01, checkout=2018-01-01}, totalprice=111, depositpaid=true, lastname=Brown},
//        //    {firstname=Jim, additionalneeds=Breakfast, totalprice=111, depositpaid=true, lastname=Brown}
//        //    ]
//
//
//
//        RequestSpecification r = RestAssured.given();
//        r.baseUri("https://restful-booker.herokuapp.com/");
//
//        // List of Two PARENT Maps
//
//
//        Map<String,Object> parent = new HashMap<>();
//        parent.put("firstname","Jim");
//        parent.put("lastname","Brown");
//        parent.put("totalprice",111);
//        parent.put("depositpaid",true);
//        parent.put("additionalneeds","Breakfast");
//        Map<String,String> bookingdatesMap = new HashMap<>();
//        bookingdatesMap.put("checkin","2018-01-01");
//        bookingdatesMap.put("checkout","2018-01-01");
//        parent.put("bookingdates",bookingdatesMap);
//
//        System.out.println(parent);
//
//
//        Map<String,Object> parent2 = new HashMap<>();
//        parent2.put("firstname","Jim");
//        parent2.put("lastname","Brown");
//        parent2.put("totalprice",111);
//        parent2.put("depositpaid",true);
//        parent2.put("additionalneeds","Breakfast");
//        Map<String,String> bookingdatesMap2 = new HashMap<>();
//        bookingdatesMap2.put("checkin","2018-01-01");
//        bookingdatesMap2.put("checkout","2018-01-01");
//        parent2.put("bookingdates",bookingdatesMap2);
//
//        System.out.println(parent2);
//
//
//        List<Map<String,Object>> mylist = new ArrayList();
//        mylist.add(parent);
//        mylist.add(parent2);
//
//        System.out.println(mylist);
//
//
////        FileInputStream inputStream = new FileInputStream();
////        // Read the file and
////        //pass the objec to the body
////        Object payload = "";
//
//
//
//        r.basePath("/booking");
//        r.contentType(ContentType.JSON);
//        r.body(payload);
//
//        Response response = r.when().post();
//        ValidatableResponse vr = response.then().log().all();
//        // TC # 1
//        vr.statusCode(200);
//        // Extract the Token
//        Integer bookingid = response.then().extract().path("bookingid");
//        System.out.println(bookingid);
//
//
//
//
//
//
//
//
//
//
//
//
//
////            // { "name" : "pramod", "age" : 31 , "id" : 321}
////           // {name=pramod, id=321, age=31}
////           // Map -> Json
////
////            Map<String,Object> map = new HashMap();
////            map.put("name","pramod");
////            map.put("age",31);
////            map.put("id",321);
////
////        System.out.println(map);
//
//
//    }
//}
