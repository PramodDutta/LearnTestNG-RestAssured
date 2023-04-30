package com.thetestingacademy._practice.postCrud.response;

import com.thetestingacademy._practice.postCrud.request.Booking;

public class ResponseBooking {

        private Integer bookingid;
        private Booking booking;

        public Integer getBookingid() {
            return bookingid;
        }

        public void setBookingid(Integer bookingid) {
            this.bookingid = bookingid;
        }

        public Booking getBooking() {
            return booking;
        }

        public void setBooking(Booking booking) {
            this.booking = booking;
        }
}
