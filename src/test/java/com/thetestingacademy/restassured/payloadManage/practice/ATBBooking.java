package com.thetestingacademy.restassured.payloadManage.practice;

public class ATBBooking {

    private String firstname;
    private String lastname;
    private Double totalprice;
    private Boolean depositpaid;
    private String additionalneeds;
    private ATBBookingdates atbBookingdates;

    ATBBooking(){}

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    public Boolean getDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(Boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public ATBBookingdates getAtbBookingdates() {
        return atbBookingdates;
    }

    public void setAtbBookingdates(ATBBookingdates atbBookingdates) {
        this.atbBookingdates = atbBookingdates;
    }
}
