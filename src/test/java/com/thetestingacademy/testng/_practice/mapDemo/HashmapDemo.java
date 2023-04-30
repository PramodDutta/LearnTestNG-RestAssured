package com.thetestingacademy.testng._practice.mapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {


     public static void main(String[] args) {

          HashMap<String,Integer> map = new HashMap<>();

          map.put("maths",98);
          map.put("sst",97);
          map.put("science",100);

          boolean isPresent = map.containsKey("maths");
          System.out.println(isPresent);


          for(Map.Entry<String,Integer> e: map.entrySet()){
               System.out.println(e.getKey() +" - "+ e.getValue());
          }






     }
}
