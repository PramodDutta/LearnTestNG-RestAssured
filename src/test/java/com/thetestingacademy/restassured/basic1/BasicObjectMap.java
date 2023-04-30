package com.thetestingacademy.restassured.basic1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Map;

public class BasicObjectMap {

    //{
    //     "firstname": "Jim",
    //     "lastname": "Brown",
    //     "totalprice": 111,
    //     "depositpaid": true,
    //     "additionalneeds": "Breakfast",
    //     "bookingdates": {
    //         "checkin": "2021-07-01",
    //         "checkout": "2021-07-01"
    //     }
    // }

    @Test
    public void setPayload() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        ObjectNode bookingDetails = objectMapper.createObjectNode();
        ObjectNode bookingDates = objectMapper.createObjectNode();
        bookingDates.put("checkin","2021-07-01");
        bookingDates.put("checkout","2021-07-01");
        bookingDetails.put("firstname", "Jim");
        bookingDetails.put("lastname", "Brown");
        bookingDetails.put("totalprice", 111);
        bookingDetails.put("depositpaid", true);
        bookingDetails.put("additionalneeds", "Breakfast");
        bookingDetails.set("bookingdates", bookingDates);
        String createdPlainJsonObject = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(bookingDetails);
        System.out.println("Created plain JSON Object is : \n"+ createdPlainJsonObject);

        // To Get a Value
        System.out.println(bookingDetails.get("firstname").asText());
        System.out.println(bookingDetails.get("lastname").asText());

        Iterator<String> iterator = bookingDates.fieldNames();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Iterator<Map.Entry<String, JsonNode>> iterator_allvalues = bookingDates.fields();
        while (iterator_allvalues.hasNext()){
            Map.Entry<String, JsonNode> nodeEntry = iterator_allvalues.next();
            System.out.println(nodeEntry.getKey());
            System.out.println(nodeEntry.getValue());
        }

        // Remove & Update

        String removedFieldValue = bookingDetails.remove("firstname").asText();
        System.out.println("Value of Removed field is " + removedFieldValue);
        String removedJsonObject = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(bookingDetails);
        System.out.println("After removing field , JSON Object is : \n"+ removedJsonObject);

        // To replace a field value, use put() method for non ObjectNode type and replace() or set() for ObjectNode
        bookingDetails.put("firstname", "Lucky");
        bookingDetails.put("lastname", "pushal");
        String updatedJsonObject = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(bookingDetails);
        System.out.println("After updating field , JSON Object is : \n"+ updatedJsonObject);





    }


}
