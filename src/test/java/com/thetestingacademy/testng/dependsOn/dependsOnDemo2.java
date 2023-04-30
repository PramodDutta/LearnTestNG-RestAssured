package com.thetestingacademy.testng.dependsOn;

import org.testng.annotations.Test;

public class dependsOnDemo2 {

    @Test(groups = { "init" })
    public void serverStartedOk() {
        System.out.println("serverStartedOk");
    }

    @Test(groups = { "init" })
    public void initEnvironment() {
        System.out.println("initEnvironment");
    }

    @Test(dependsOnGroups = { "init.*" })
    public void method1() {
        System.out.println("Now I will run");
    }

}
