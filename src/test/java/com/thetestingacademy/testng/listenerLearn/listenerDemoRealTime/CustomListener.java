package com.thetestingacademy.testng.listenerLearn.listenerDemoRealTime;

import org.testng.*;

public class CustomListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess");
        // Logic for the Reporting
        DataPushUtils.pushData("Pass",result.getTestName(),"RestfulBooker");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure");
        DataPushUtils.pushData("Fail",result.getTestName(),"RestfulBooker");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish");
    }
}
