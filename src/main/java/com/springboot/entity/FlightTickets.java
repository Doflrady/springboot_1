package com.springboot.entity;

import org.springframework.stereotype.Component;

public class FlightTickets {
    private int id;
    private int flightId;
    private String flightDate;
    private int ticketPrice;
    private String sellCompany;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getFlightId() {
        return flightId;
    }
    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }
    public String getFlightDate() {
        return flightDate;
    }
    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }
    public int getTicketPrice() {
        return ticketPrice;
    }
    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    public String getSellCompany() {
        return sellCompany;
    }
    public void setSellCompany(String sellCompany) {
        this.sellCompany = sellCompany;
    }
}
