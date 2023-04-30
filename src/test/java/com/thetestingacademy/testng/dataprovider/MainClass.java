package com.thetestingacademy.testng.dataprovider;

import org.testng.annotations.Test;

public class MainClass {

    @Test(dataProvider ="LoginData" ,dataProviderClass = DataProviderDemo.class)
    public void testLoginData(String username,String password){
        System.out.println("UserName - "+ username + " || Pass" +
                password + " || Thread -> -- " +Thread.currentThread().getId());

    }
}
