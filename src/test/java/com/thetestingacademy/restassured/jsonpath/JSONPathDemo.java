package com.thetestingacademy.restassured.jsonpath;

import io.restassured.path.json.JsonPath;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

public class JSONPathDemo {

    public static void main(String[] args) {

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

        JsonPath jsonPath = JsonPath.from(jsonString);



        System.out.println("First name is first employee :"+ jsonPath.getString("[0].first_name"));

        // To get whole indexed element
        System.out.println("All details of first employee : " +jsonPath.getJsonObject("[0]"));

        /*
         * To get first names of all employees Since it is a JSON array and we are not
         * specifying index then it will pick firstName from each element and return as
         * a list.
         */
        System.out.println("First name of all employees" + jsonPath.getList("first_name"));

        /* To get all first name of all females only
         * If we want to filter records based on conditions we can use find or findAll expression.
         * findAll will iterate through each element in array and match condition. "it" represent current element.
         * For each element it will check if gender is "female". If yes then take firstName of current element.
         * findAl returns a List. */
        System.out.println("First name of all female employees : "+jsonPath.getList("findAll{it.gender == 'Female'}.first_name"));
        System.out.println("First name of all Male employees : "+jsonPath.getList("findAll{it -> it.gender == 'Male'}.first_name"));

        /* To get first female name
         * If we want to get firstName of first female employee we can use find expression.*/
        System.out.println("First name of first female employee : "+jsonPath.getString("find{it.gender == 'Female'}.first_name"));

        /*
         * We can also use relational operator like first name of all employees whose id is 5 or more
         */
        System.out.println("First name of all employees whose id is 5 or more : " + jsonPath.getList("findAll{it.id >= 5}.first_name"));

        // we can use use and (&) operator - logical
        System.out.println("First name of all employees whose id is 5 or more but less than 8 : " + jsonPath.getList("findAll{it.id >= 5 & it.id < 8}.first_name"));

        // We can also use or (|) operator
        System.out.println("First name of all employees whose id is greater than 9 or gender is female : " + jsonPath.getList("findAll{it.id >= 9 | it.gender == 'Female'}.first_name"));

        // We can get size of array using size() or size
        System.out.println("Total number of employees : " + jsonPath.getString("size()"));








    }
}
