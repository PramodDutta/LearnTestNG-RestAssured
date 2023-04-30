package com.thetestingacademy.testng.dataprovider;

import lombok.Data;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleDP {

    @DataProvider
    public Object[][] getData(){
        return new Object[][] {
          new Object[] {"admin","admin"},
          new Object[] {"pramod", "pass123"}
        };
    }



    @Test(dataProvider = "getData")
    public void runTest(String username,String password){

        System.out.println("--> " +username + password);
    }
}



