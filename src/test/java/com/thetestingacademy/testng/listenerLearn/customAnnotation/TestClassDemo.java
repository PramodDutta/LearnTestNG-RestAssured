package com.thetestingacademy.testng.listenerLearn.customAnnotation;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListenerCA.class)
public class TestClassDemo {

    @InfoFailCustomAnnotate(testName = {"test1()"},lineNumber = 11)
    @Test
    public void test1(){
        System.out.println("test1");
        Assert.assertTrue(true);
    }

    @InfoFailCustomAnnotate(testName = {"test2()"},lineNumber = 18)
    @Test
    public void test2(){
        System.out.println("test2");
        Assert.assertTrue(false);
    }
}
