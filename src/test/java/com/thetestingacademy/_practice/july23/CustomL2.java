package com.thetestingacademy._practice.july23;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomL2 implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Write to Report
        System.out.println("Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

        // Take a ScreenShot of Code

//        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("WebDriver");
//
//        // Take the screenshot
//        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//        // Define the destination path for the screenshot
//        String destinationPath = "screenshots/" + result.getName() + ".png";
//
//        try {
//            // Copy the screenshot to the destination path
//            Files.copy(screenshotFile.toPath(), new File(destinationPath).toPath(), StandardCopyOption.REPLACE_EXISTING);
//            System.out.println("Screenshot captured: " + destinationPath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        System.out.println("Test Failed: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage");
    }



    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test Suite started: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test Suite finished: " + context.getName());
    }
}
