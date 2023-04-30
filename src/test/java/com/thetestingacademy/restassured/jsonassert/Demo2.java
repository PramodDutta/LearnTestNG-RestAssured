package com.thetestingacademy.restassured.jsonassert;

import org.json.JSONException;
import org.json.JSONObject;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

public class Demo2 {

    public static void main(String[] args) throws JSONException {

        JSONObject jsonObject1 = new JSONObject("{\r\n" +
                "  \"lastName\": \"Pramod\",\r\n" +
                "  \"firstName\": \"Dutta\",\r\n" +
                "  \"address\": {\r\n" +
                "    \"city\": \"Kolkata\",\r\n" +
                "    \"state\": \"WB\"\r\n" +
                "  }\r\n" +
                "}");
        JSONObject jsonObject2 = new JSONObject("{\r\n" +
                "  \"lastName\": \"Aman\",\r\n" +
                "  \"firstName\": \"Sharma\",\r\n" +
                "  \"communicationAddress\": {\r\n" +
                "    \"city\": \"Kolkata\",\r\n" +
                "    \"state\": \"WB\"\r\n" +
                "  },\r\n" +
                "  \"skills\": [\r\n" +
                "    \"CA\",\r\n" +
                "    \"BCOM\"\r\n" +
                "  ]\r\n" +
                "}");

        // I want to assert address objects are same in both
        // Since "address" and "communicationAddress" are JSON Objects so we need to use proper method i.e. getJSONObject()
        JSONAssert.assertEquals(jsonObject1.getJSONObject("address"), jsonObject2.getJSONObject("communicationAddress"), JSONCompareMode.LENIENT);
    }
}






