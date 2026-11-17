package org.example.model;

public class Ride {
    private int rideID;
    private Driver driver;
    private User rider;
    private String rideStatus;
    private String source;
    private String destination;

    public Ride(int rideID, Driver driver, User rider, String rideStatus, String source, String destination){

        this.rideID = rideID;
        this.driver = driver;
        this.rider = rider;
        this.rideStatus = rideStatus;
        this.source = source;
        this.destination = destination;
    }

    public void setRideStatus(){
        this.rideStatus = rideStatus;
    }
}
