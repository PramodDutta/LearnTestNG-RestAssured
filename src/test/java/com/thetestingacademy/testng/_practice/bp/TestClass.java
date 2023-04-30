package com.thetestingacademy.testng._practice.bp;

public class TestClass {

    public static void main(String[] args) {
        NoBP noBPObeject = new NoBP();
        noBPObeject.Step1();
        noBPObeject.Step2();
        noBPObeject.Step3();
        noBPObeject.Step4();


        BP bpObject = new BP();
        bpObject.Step1().Step2().Step3().Step4();


    }
}
