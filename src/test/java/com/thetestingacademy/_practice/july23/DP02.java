package com.thetestingacademy._practice.july23;

import org.testng.annotations.Test;

public class DP02 {

    @Test(dataProvider = "getData", dataProviderClass = UtilExcelPro.class)
    public void loginTesting(String username,String password) {
        System.out.println("login Test with the Creds -> "  + username +" -- "+ password);
    }
}
