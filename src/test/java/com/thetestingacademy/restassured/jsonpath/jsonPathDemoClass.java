package com.thetestingacademy.restassured.jsonpath;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class jsonPathDemoClass {

    @Test
    public void jsonPathTest(){

        String jsonString = "[{\n" +
                "  \"id\": 1,\n" +
                "  \"first_name\": \"Lothaire\",\n" +
                "  \"last_name\": \"Benazet\",\n" +
                "  \"email\": \"lbenazet0@tinyurl.com\",\n" +
                "  \"gender\": \"Male\"\n" +
                "}, {\n" +
                "  \"id\": 2,\n" +
                "  \"first_name\": \"Shellie\",\n" +
                "  \"last_name\": \"Cowser\",\n" +
                "  \"email\": \"scowser1@163.com\",\n" +
                "  \"gender\": \"Female\"\n" +
                "}, {\n" +
                "  \"id\": 3,\n" +
                "  \"first_name\": \"Sharl\",\n" +
                "  \"last_name\": \"Hesbrook\",\n" +
                "  \"email\": \"shesbrook2@economist.com\",\n" +
                "  \"gender\": \"Female\"\n" +
                "}, {\n" +
                "  \"id\": 4,\n" +
                "  \"first_name\": \"Merrili\",\n" +
                "  \"last_name\": \"Acom\",\n" +
                "  \"email\": \"macom3@goo.ne.jp\",\n" +
                "  \"gender\": \"Female\"\n" +
                "}, {\n" +
                "  \"id\": 5,\n" +
                "  \"first_name\": \"Remus\",\n" +
                "  \"last_name\": \"Downgate\",\n" +
                "  \"email\": \"rdowngate4@shinystat.com\",\n" +
                "  \"gender\": \"Male\"\n" +
                "}, {\n" +
                "  \"id\": 6,\n" +
                "  \"first_name\": \"Tatiana\",\n" +
                "  \"last_name\": \"Tribble\",\n" +
                "  \"email\": \"ttribble5@simplemachines.org\",\n" +
                "  \"gender\": \"Female\"\n" +
                "}, {\n" +
                "  \"id\": 7,\n" +
                "  \"first_name\": \"Wood\",\n" +
                "  \"last_name\": \"Hebbes\",\n" +
                "  \"email\": \"whebbes6@psu.edu\",\n" +
                "  \"gender\": \"Male\"\n" +
                "}, {\n" +
                "  \"id\": 8,\n" +
                "  \"first_name\": \"Kendall\",\n" +
                "  \"last_name\": \"Bony\",\n" +
                "  \"email\": \"kbony7@epa.gov\",\n" +
                "  \"gender\": \"Male\"\n" +
                "}, {\n" +
                "  \"id\": 9,\n" +
                "  \"first_name\": \"Robinet\",\n" +
                "  \"last_name\": \"Gooday\",\n" +
                "  \"email\": \"rgooday8@boston.com\",\n" +
                "  \"gender\": \"Male\"\n" +
                "}, {\n" +
                "  \"id\": 10,\n" +
                "  \"first_name\": \"Laural\",\n" +
                "  \"last_name\": \"Krzysztofiak\",\n" +
                "  \"email\": \"lkrzysztofiak9@sun.com\",\n" +
                "  \"gender\": \"Female\"\n" +
                "}]";

        JsonPath jsonPath = new JsonPath(jsonString);

        System.out.println(jsonPath.getString("[0].first_name"));

        //System.out.println(jsonPath.getJsonObject("[0]"));
        System.out.println(jsonPath.getList("first_name"));

        System.out.println(jsonPath.getString("findAll{it.gender == 'Female'}.first_name"));
        System.out.println(jsonPath.getString("findAll{it.id >=9}.first_name"));






    }
}
