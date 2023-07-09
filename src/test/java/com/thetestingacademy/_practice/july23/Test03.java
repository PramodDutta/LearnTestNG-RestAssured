package com.thetestingacademy._practice.july23;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomL2.class)
public class Test03 {

    @Test(groups = "sanity")
    public void test1(){
        System.out.println("Test1");
        Assert.assertTrue(false);
    }

    // onTest Start -> Execute Code 1
    // onTestSuccess -> Execute Code 2
    // onTestFailure -> Execute Code 3

    @Test(groups = "sanity")
    public void test2(){
        System.out.println("Test2");
        Assert.assertTrue(true);
    }

    @Test(groups = "sanity")
    public void test3(){
        System.out.println("Test3");
        Assert.assertTrue(true);
    }
}
