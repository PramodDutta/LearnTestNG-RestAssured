package com.thetestingacademy.testng.dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {


    @DataProvider(name = "LoginData", parallel = true)
    public Object[][] getData(){
        return new Object[][]{
                new Object[] { "admin", "admin"},
                new Object[] { "admin", "admin123"},
                new Object[] { "admin2", "admin12345"},
                new Object[] { "admin3", "admin"}
        };
    }

}
