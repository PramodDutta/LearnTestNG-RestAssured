package com.thetestingacademy.testng.parrallel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainClass2 {
    @BeforeMethod
    public void beforeMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("Before test-method. Thread id is: " + id + getClass().getSimpleName());
    }

    @Test
    public void testMethodsOne() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method One. Thread id is: " + id + getClass().getSimpleName());
    }

    @Test
    public void testMethodsTwo() {
        long id = Thread.currentThread().getId();
        System.out.println("Simple test-method Two. Thread id is: " + id + getClass().getSimpleName());
    }

    @AfterMethod
    public void afterMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("After test-method. Thread id is: " + id + getClass().getSimpleName());
    }


}
