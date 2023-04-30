package com.thetestingacademy.restassured;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class passValueBetweenTest {

    @Test
    public void Method1(ITestContext iTestContext){
        String token = "Hello I am Token";
        iTestContext.setAttribute("token",token);
    }

    @Test
    public void Method2(ITestContext iTestContext){
        String tokenfromFirstMethso = (String) iTestContext.getAttribute("token");
        System.out.println(tokenfromFirstMethso);

    }


}
