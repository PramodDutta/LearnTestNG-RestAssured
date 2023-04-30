package com.thetestingacademy.restassured.payloadManage.usingMap;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {

    public static void main(String[] args) {


        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the Map
        // using standard put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        if (map.containsKey("vishal")) {

            // Mapping
            Integer a = map.get("vishal");

            // Printing value for the corresponding key
            System.out.println("value for key"
                    + " \"vishal\" is:- " + a);
        }

        //HashMap<K, V> hm = new HashMap<K, V>();

        HashMap<Integer, String> hm1 = new HashMap<>();

        // Initialization of a HashMap using Generics
        HashMap<Integer, String> hm2
                = new HashMap<Integer, String>();

        // Adding elements using put method
        // Custom input elements
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");

        // Print and display mapping of HashMap 1
        System.out.println("Mappings of HashMap hm1 are : "
                + hm1);

        // Print and display mapping of HashMap 2
        System.out.println("Mapping of HashMap hm2 are : "
                + hm2);


        HashMap<String, Integer> map2 = new HashMap<>();

        // Add elements using put method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        for (Map.Entry<String, Integer> e : map2.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());

    }
}
