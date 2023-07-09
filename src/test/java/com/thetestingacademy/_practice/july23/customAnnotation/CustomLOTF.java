package com.thetestingacademy._practice.july23.customAnnotation;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Arrays;

public class CustomLOTF implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        FailInfoCustomAnnotate i = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FailInfoCustomAnnotate.class);
        System.out.println(Arrays.toString(i.testName()));
        System.out.println(i.lineNumber());
    }
}

