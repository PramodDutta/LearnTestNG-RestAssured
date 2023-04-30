package com.thetestingacademy.testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MainLoginData {


    @Test(dataProvider ="getData" ,dataProviderClass = UtilExcel.class)
    public void testLoginData(String username,String password){
        System.out.println("UserName - "+ username);
        System.out.println("Password - "+ password);

        // Login to app API
    }
}
