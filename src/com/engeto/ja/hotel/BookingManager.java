package com.engeto.ja.hotel;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {

    private List<Booking> bookingList = new ArrayList<>();

    public void addBooking(Booking booking) {
        bookingList.add(booking);
    }

    public Booking getBooking(int index) {
        return bookingList.get(index);
    }

    public List<Booking> getBookings() {
        return new ArrayList<>(bookingList);
    }

    public void clearBookings() {
        bookingList.clear();
    }

    public double getAverageGuests() {
        double totalGuest = 0;
        for (Booking booking : bookingList) {
            totalGuest += booking.getNumberOfGuests();}
            double averageGuest = totalGuest / bookingList.size();

        return averageGuest;

    }

        public void getNumberOfWorkingBookings (List < Booking > bookingList) {
            List<Booking> businessStay = new ArrayList<>();
            for (Booking booking : bookingList) {
                if (!booking.isBusinessStay()) businessStay.add(booking);
            }
            System.out.println("Počet pracovních pobytů: " + businessStay.size());
        }

    }