package com.thetestingacademy.testng.parrallel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainClass3 {

    @Test(threadPoolSize = 3, invocationCount = 6, timeOut = 1000)
    public void testMethod()
    {
        Long id = Thread.currentThread().getId();
        System.out.println("Test method executing on thread with id: " + id);
    }
}
