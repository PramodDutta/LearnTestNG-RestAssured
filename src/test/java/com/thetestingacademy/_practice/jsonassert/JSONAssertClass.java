package com.thetestingacademy._practice.jsonassert;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

public class JSONAssertClass {

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

        String responseData3 = "{\n" +
                "  \"lastName\" : \"Dutta\",\n" +
                "  \"firstName\": \"Pramod\",\n" +
                "  \"age\": \"30\"\n" +
                "}\n";

        String a1 = "[\"apple\",\"orange\"]";
        String a2 = "[\"orange\",\"apple\"]";

//        JSONAssert.assertEquals("Strict",responseData1,responseData2, JSONCompareMode.STRICT);
//        JSONAssert.assertEquals("LENIENT",responseData1,responseData2, JSONCompareMode.LENIENT);
//        JSONAssert.assertEquals("NON_EXTENSIBLE",responseData1,responseData2, JSONCompareMode.NON_EXTENSIBLE);
       // JSONAssert.assertEquals("NON_EXTENSIBLE",responseData1,responseData3, JSONCompareMode.STRICT_ORDER);
        JSONAssert.assertEquals("STRICT_ORDER",a1,a2, JSONCompareMode.STRICT_ORDER);






    }


}
