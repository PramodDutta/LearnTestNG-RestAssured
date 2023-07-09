package com.thetestingacademy._practice.july23.customAnnotation;

import com.thetestingacademy.testng.listenerLearn.customAnnotation.InfoFailCustomAnnotate;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomLOTF.class)
public class Test05 {

    @FailInfoCustomAnnotate(testName = {"test1()"},lineNumber = 13)
    @Test
    public void test1(){
        System.out.println("test1");
        Assert.assertTrue(true);
    }

    @FailInfoCustomAnnotate(testName = {"test2()"},lineNumber = 20)
    @Test
    public void test2(){
        System.out.println("test2");
        Assert.assertTrue(false);
    }

}
