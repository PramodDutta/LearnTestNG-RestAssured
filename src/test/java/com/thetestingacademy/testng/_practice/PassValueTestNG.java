package com.thetestingacademy.testng._practice;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class PassValueTestNG {


    // M1, M2, ,M3 -
    // Sent Data from m1 -> m3

    @Test
    public  void getToken(){
        //dasdasdasdas
        //dasdadasda

        String token = "Prmaod";
    }

    @Test
    public  void useToken(ITestContext iTestContext){
        //dasdasdasdas
        //dasdadasda
        String gotToken = (String) iTestContext.getAttribute("token");
        System.out.println(gotToken);


    }



}
