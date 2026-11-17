package org.example.service;

import org.example.model.User;
import org.example.model.Ride;
public class UserService {
    public void login(User user){

        System.out.println("User loggedin.");

    }

    public void bookRide(User user, String source, String destination){
        Ride ride = new Ride(1,null,user,"Requested",source,destination);
        DriverService driverService = new DriverService();
        driverService.notifyDriver(ride);



    }

    public void cancelRide(){

    }
}
