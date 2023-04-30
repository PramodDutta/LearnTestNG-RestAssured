package com.thetestingacademy.testng.TestNGGroups;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Groups{

    @Test(groups = {"sanity","QA"}) //1
    public void sanityRun(){
        System.out.println("Sanity");
        System.out.println("QA");
    }

    @Test(groups = {"reg","sanity","e2e","Preprod"}) // 2
    public void RegRun(){
        System.out.println("Reg");
    }


    @Test(groups = {"smoke","sanity","Dev"}) //3
    public void SmokeRun(){
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }



}
