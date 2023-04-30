package com.thetestingacademy.restassured.payloadManage.practice;

public class ATBBookingdates {
    private String checkin;
    private String checkout;

    ATBBookingdates(){
    }


    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }
}
