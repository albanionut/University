package com.self.homework3;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AirportManager {
    public static Scanner sc = new Scanner(System.in);

    public static List<Flight> flights = new ArrayList<>();
    public static List<User> users = new ArrayList<>();

    public static Date convertDate(String dateInString) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-M-yyyy");
        Date date = null;
        try {
            date = simpleDateFormat.parse(dateInString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }

    public void addUser() {
        System.out.println("Name: ");
        String fname = sc.nextLine();
        System.out.println("Lastname: ");
        String lname = sc.nextLine();
        System.out.println("Date od Birth : ");
        Date birthDate = AirportManager.convertDate(sc.nextLine());

        if (birthDate != null) {
            User user = new User(fname, lname, birthDate);
            if (users.contains(user)) {
                System.out.println("The user already exist");
            } else {
                users.add(user);
                System.out.println("User add succesfully");
            }
        } else
            System.out.println("We can't create this user please try again!");
    }

    public static void removeFlightByName(List<Flight> flights, Flight flight) {
        if (flights.contains(flight)) {
            flights.remove(flight);
        } else {
            System.out.println("We dont have a flight with this name " + flight.getName());
        }
    }

    public static void showFlights(List<Flight> flights) {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }

}
