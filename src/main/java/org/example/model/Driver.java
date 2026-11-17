package org.example.model;

public class Driver extends User{
    private String vehicleRegistrationNo;
    private String driverStatus;
    public Driver(String name, int id, String phoneNumber, String email, Gender gender, float rating, String vehicleRegistrationNo, String driverStatus){
        super(name, id, phoneNumber, email, gender, rating);
        this.vehicleRegistrationNo = vehicleRegistrationNo;
        this.driverStatus = driverStatus;
    }

    public void acceptRide(){

    }

    public void rejectRide(){

    }

    public void cancelRide(){

    }



}
