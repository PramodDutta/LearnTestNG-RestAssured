package com.thetestingacademy.testng.listenerLearn;

import org.testng.IExecutionListener;

public class CustomListener implements IExecutionListener {
    @Override
    public void onExecutionFinish() {
        long endTime= System.currentTimeMillis();
        System.out.println("****   *** Finished execution at- "+ endTime +"****   *** ");

    }

    @Override
    public void onExecutionStart() {
        long startTime= System.currentTimeMillis();
        System.out.println(" ****   *** Started execution at - "+ startTime + "****   *** ");

    }
}
