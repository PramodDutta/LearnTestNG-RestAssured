package com.thetestingacademy.testng.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A01 {

    @Test
    void testCase01(){
          // Rest Assured
           // asString()
           // jsonpATH - id
        // Response
        // id = 3 , name  : pramod

        // Expected Result - pramod
        // Actual Result - Response? - pramod

//        SoftAssert s = new SoftAssert();
//        s.assertEquals(true,false,"True should not be equal to False");
//        System.out.println("Please execute me");
//        s.assertAll();


        // Hard Assert
        Assert.assertEquals(true,true,"Failed");
        System.out.println("End");
        if("pramod".equalsIgnoreCase("pramod")){
            Assert.fail();
        }

        Assert.assertTrue(false);


    }

}
