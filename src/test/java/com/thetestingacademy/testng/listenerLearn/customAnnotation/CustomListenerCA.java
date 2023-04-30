package com.thetestingacademy.testng.listenerLearn.customAnnotation;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Arrays;

public class CustomListenerCA  implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        InfoFailCustomAnnotate i = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(InfoFailCustomAnnotate.class);
        System.out.println(Arrays.toString(i.testName()));
        System.out.println(i.lineNumber());
        }
    }

