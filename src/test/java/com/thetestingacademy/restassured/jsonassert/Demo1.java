package com.thetestingacademy.restassured.jsonassert;

import com.google.gson.JsonArray;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

public class Demo1 {

    public static void main(String[] args) throws JSONException {

        String responseData1 = "{\n" +
                "  \"firstName\" : \"Pramod\",\n" +
                "  \"lastName\": \"Dutta\",\n" +
                "  \"age\": \"30\"\n" +
                "}\n";

        String responseData2 = "{ " +
                "\"firstName\" : \"Pramod\", " +
                "\"lastName\": \"Dutta\", " +
                "\"age\": \"30\", " +
                "\"address\" : \"New Delhi\" }";

        String responseData2Difference = "{ " +
                "\"lastName\" : \"Pramod\", " +
                "\"firstName\": \"Dutta\", " +
                "\"age\": \"30\", " +
                "\"address\" : \"New Delhi\" }";

        String responseData3 = "{\n" +
                "  \"lastName\" : \"Dutta\",\n" +
                "  \"firstName\": \"Pramod\",\n" +
                "  \"age\": \"30\"\n" +
                "}\n";

        String a1 = "[\"apple\",\"orange\"]";
        String a2 = "[\"orange\",\"apple\"]";


        JSONAssert.assertEquals("NON_EXTENSIBLE",responseData2Difference,responseData3, JSONCompareMode.NON_EXTENSIBLE);


        //In the above JSONs we have a different order of fields but it will not
        // fail with strict order mode as it is applied for JSON arrays not for JSON Objects.


    }
}
