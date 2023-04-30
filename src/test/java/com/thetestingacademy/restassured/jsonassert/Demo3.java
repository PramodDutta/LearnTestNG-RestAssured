package com.thetestingacademy.restassured.jsonassert;

import org.json.JSONArray;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

public class Demo3 {

    public static void main(String[] args) throws JSONException {

        JSONArray jSONArray1 = new JSONArray("[\n" +
                "  {\n" +
                "    \"id\": 1,\n" +
                "    \"first_name\": \"Pramod\",\n" +
                "    \"last_name\": \"Dutta\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 2,\n" +
                "    \"first_name\": \"Aman\",\n" +
                "    \"last_name\": \"Sharma\"\n" +
                "  }\n" +
                "]");

        JSONArray jSONArray2 = new JSONArray("[\n" +
                "  {\n" +
                "    \"id\": 1,\n" +
                "    \"first_name\": \"Pramod\",\n" +
                "    \"last_name\": \"Dutta\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 2,\n" +
                "    \"first_name\": \"Aman\",\n" +
                "    \"last_name\": \"Sharma\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 3,\n" +
                "    \"first_name\": \"Lucky\",\n" +
                "    \"last_name\": \"Sharma\"\n" +
                "  }\n" +
                "]");

        JSONAssert.assertEquals(jSONArray1.getJSONObject(2), jSONArray2.getJSONObject(2), JSONCompareMode.LENIENT);

    }
}
