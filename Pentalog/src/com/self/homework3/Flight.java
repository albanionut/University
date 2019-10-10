package com.self.homework3;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Flight {
    enum Status {
        SCHEDULED, CANCELED, FINISHED;
    }

    private String name;
    private String destination;
    private Date departureDate;
    private int flightDuration;//seconds
    private int maxUserCapacity;
    private Status status;

    public Flight(String name, String destination, Date departureDate, int flightDuration, int maxUserCapacity, Status status) {
        this.name = name;
        this.destination = destination;
        this.departureDate = departureDate;
        this.flightDuration = flightDuration;
        this.maxUserCapacity = maxUserCapacity;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }

    public int getMaxUserCapacity() {
        return maxUserCapacity;
    }

    public void setMaxUserCapacity(int maxUserCapacity) {
        this.maxUserCapacity = maxUserCapacity;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Flight) {
            Flight anotherFLight = (Flight) obj;
            if (this.name.equals(anotherFLight.name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "name='" + name + '\'' +
                ", destination='" + destination + '\'' +
                ", departureDate=" + departureDate +
                ", flightDuration=" + flightDuration +
                ", maxUserCapacity=" + maxUserCapacity +
                ", status=" + status +
                '}';
    }
}