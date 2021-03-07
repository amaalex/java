package com.company;

import java.time.LocalTime;
import java.util.Map;

public class Hotel extends Location implements Visitable, Payable {
    private LocalTime openingTime, closingTime;
    private double ticketPrice;

    public Hotel(String name, String description) {
        super(name, description);
    }

    public  void setOpeningTime(LocalTime openingTime){
        this.openingTime = openingTime;
    }

    public void setClosingTime(LocalTime closingTime){
        this.closingTime = closingTime;
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
}
