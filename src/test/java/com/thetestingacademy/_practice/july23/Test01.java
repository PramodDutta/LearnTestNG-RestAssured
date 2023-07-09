package com.thetestingacademy._practice.july23;

import org.testng.annotations.Test;

public class Test01 {

    // login  -> Test 1, 2, 3
    // dashboard 1,2,3

    @Test
    public void serverStartedOk(){
        System.out.println("I will start the server");
    }

    @Test(dependsOnMethods = {"serverStartedOk"})
    public void afterServerStart(){
        System.out.println("After server start!!!");
    }



}
