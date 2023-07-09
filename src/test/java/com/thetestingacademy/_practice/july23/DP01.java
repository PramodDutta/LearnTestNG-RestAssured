package com.thetestingacademy._practice.july23;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP01 {


    // admin, admin
    // admin, password123
    // admin, password
    // admin , 123

    @DataProvider(parallel = true)
    public Object[][] getData(){
        return new Object[][] {
                new Object[] { "admin","admin"},
                new Object[] { "admin","password123"},
                new Object[] { "admin","admin"},
                new Object[] { "admin","password123"}
        };

    }



    @Test(dataProvider = "getData")
    public void loginTesting(String username,String password) {
        System.out.println("login Test with the Creds -> "  + username +" -- "+ password);
    }

}
