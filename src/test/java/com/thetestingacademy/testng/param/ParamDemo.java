package com.thetestingacademy.testng.param;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamDemo {

    @Parameters("browser")
    @Test(priority = 1)
    void demo1(String value){
        System.out.println("Browser is " +value);
        // Open the Browser and select dadadada

    }

    @Parameters("url")
    @Test(priority = 1)
    void demo2(String value){
        System.out.println("URL is " +value);
        // Open the Browser and select dadadada

    }

}
