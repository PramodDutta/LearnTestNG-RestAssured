package com.thetestingacademy.testng.dataprovider;

import org.testng.annotations.Test;

public class DPDemo {




    @Test(dataProvider = "getData", dataProviderClass = UtilExcel.class)
    public void DPNormalExcel(String username,String password){
        System.out.println(username+password);
    }

    @Test(dataProvider = "getDataFillo", dataProviderClass = CSVDPFillo.class)
    public void DPFormFillo(String[] username,String[] password){
        for (String i: username) {
            System.out.println(i);
        }
        for (String j: password) {
            System.out.println(j);
        }

    }






}
