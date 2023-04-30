package com.thetestingacademy.testng.listenerLearn.listenerDemoRealTime;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListener.class)
public class LDClass {

    @Test
    public void testCreateBooking(){
        // Rest Assured Code to Create Bookings
        Integer id = 12;
        Assert.assertNotNull(id);
    }

    @Test
    public void testCreateBooking2(){
        // Rest Assured Code to Create Bookings
        Integer id = 12;
        Assert.assertNotNull(id);
    }


}
