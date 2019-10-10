package com.self.homework3;

import java.util.ArrayList;
import java.util.List;

import static com.self.homework3.AirportManager.users;

public class Main {
    public static void main(String[] args) {
//        Flight d1 = new Flight("cd1", "sa",AirportManager.convertDate("11-11-1111")  ,200, 12, Flight.Status.SCHEDULED);
//        Flight c1 = new Flight("cd12", "sa", AirportManager.convertDate("12-11-1111") , 200, 12, Flight.Status.SCHEDULED);
//        if (d1.getDepartureDate().equals(c1.getDepartureDate())) {
//            System.out.println("We have duplicate flights");
//        } else
//            System.out.println("We don't have duplicate flights");
//
//        System.out.println(c1.getDepartureDate());
//        List<Flight> flights = new ArrayList<>();
//        flights.add(d1);
//        flights.add(c1);
//        AirportManager.removeFlightByName(flights,d1);
        AirportManager airportManager = new AirportManager();

        airportManager.addUser();
        System.out.println(users);
        airportManager.addUser();
        System.out.println(users);

    }
}
