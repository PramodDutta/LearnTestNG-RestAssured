package com.thetestingacademy.testng.listenerLearn.listenerDemoRealTime;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import java.util.HashMap;

public class DataPushUtils {

    public static void pushData(String status,String testName,String module){
        //http://localhost:9200/restfulbooker/tc1
        HashMap<String,String > dataMap = new HashMap<>();
        dataMap.put("testName",testName);
        dataMap.put("module",module);
        dataMap.put("status",status);



        RestAssured.given().baseUri("http://localhost:9200/restfulbooker/tc1")
                .contentType(ContentType.JSON)
                .body(dataMap)
                .when().post()
                .then()
                .log().all()
                .assertThat()
                .statusCode(201);

    }
}
