package com.springboot.entity;

import org.springframework.stereotype.Component;

public class Flights {
    private int id;
    private String flightCode;
    private String flightDate;
    private String airline;
    private String type;
    private int takeAirportId;
    private int landingAirportId;
    private String takeTime;
    private String landingTime;
    private String flightTime;
    private String  stopAirport;
    private int referencePrice;

    private String startport;
    private String endport;

    public String getStartport() {
        return startport;
    }
    public void setStartport(String startport) {
        this.startport = startport;
    }
    public String getEndport() {
        return endport;
    }
    public void setEndport(String endport) {
        this.endport = endport;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFlightCode() {
        return flightCode;
    }
    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }
    public String getFlightDate() {
        return flightDate;
    }
    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }
    public String getAirline() {
        return airline;
    }
    public void setAirline(String airline) {
        this.airline = airline;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getTakeAirportId() {
        return takeAirportId;
    }
    public void setTakeAirportId(int takeAirportId) {
        this.takeAirportId = takeAirportId;
    }
    public int getLandingAirportId() {
        return landingAirportId;
    }
    public void setLandingAirportId(int landingAirportId) {
        this.landingAirportId = landingAirportId;
    }
    public String getTakeTime() {
        return takeTime;
    }
    public void setTakeTime(String takeTime) {
        this.takeTime = takeTime;
    }
    public String getLandingTime() {
        return landingTime;
    }
    public void setLandingTime(String landingTime) {
        this.landingTime = landingTime;
    }
    public String getFlightTime() {
        return flightTime;
    }
    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }
    public String getStopAirport() {
        return stopAirport;
    }
    public void setStopAirport(String stopAirport) {
        this.stopAirport = stopAirport;
    }
    public int getReferencePrice() {
        return referencePrice;
    }
    public void setReferencePrice(int referencePrice) {
        this.referencePrice = referencePrice;
    }

}
