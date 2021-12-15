package dkit.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * OOP CA2 December 2021 - Airplane Management System  STARTER CODE
 */
public class App 
{
    public static void main( String[] args ){
        new App().start();
    }

    private void start() {

        System.out.println("OOP - CA2 - 20% - December 2021 - AirplaneManager");

        //Q2
         CargoAirplane cargoPlane1 = new CargoAirplane("Douglas DC-4",20000);
         CargoAirplane cargoPlane2 = new CargoAirplane("Boeing C-7000",25000);

        // display the two objects
        System.out.println("\n***  Displaying CargoAirplane objects   ***");
        System.out.println("-------------------------------------------------------");
        System.out.println(cargoPlane1);
        System.out.println(cargoPlane2);

        AirplaneManager mgr = new AirplaneManager();

        //Q2
         PassengerAirplane passengerPlane1 = new PassengerAirplane("Boeing 747",524);
         PassengerAirplane passengerPlane2 = new PassengerAirplane("Airbus 380",525);
         //Add passengers to Passenger planes
         passengerPlane1.addPassenger("Tom Hardy");
         passengerPlane1.addPassenger("Margot Robbie");
         passengerPlane2.addPassenger("Emma Thompson");

        System.out.println("\n***  Displaying PassengerAirplane objects   ***");
        System.out.println("-------------------------------------------------------");
        System.out.println(passengerPlane1);
        System.out.println(passengerPlane2);

        //Q3
        // write calls to methods implemented for Q3.


       mgr.addAirplane(cargoPlane1);
        mgr.addAirplane(cargoPlane2);
        mgr.addAirplane(passengerPlane1);
        mgr.addAirplane(passengerPlane2);

        System.out.println("\n***  Displaying all Airplane objects from the list   ***\n");
        System.out.println("-------------------------------------------------------");
        mgr.displayAllAirplanes();

        System.out.println("\n***  Displaying PassengerAirplane only objects   ***");
        System.out.println("-------------------------------------------------------");
        mgr.displayAllPassengerAirplanes();

        System.out.println("\n***  Displaying all CargoAirplane only objects   ***");
        System.out.println("-------------------------------------------------------");
        ArrayList<Airplane> cargoList = mgr.getAllCargoAirplanes();
        System.out.println(cargoList);


        System.out.println("\n***  DAirplane Exists   ***");
        System.out.println("-------------------------------------------------------");
        boolean airoplainExist = mgr.containsAirplane(cargoPlane1);
        System.out.println("The airplane with ID "+cargoPlane1.getId()+ " is in the list: " +airoplainExist);

        System.out.println("\n***  Find Passenger Names to Airplane   ***");
        System.out.println("-------------------------------------------------------");
        mgr.findAirplaneByPassengerName("Tom Hardy");

        //Question 4
        // Uncomment all the code below and implement the two methods
        // in the CityDistanceManager class.

//        CityDistanceManager cityDistanceManager = new CityDistanceManager();
//        cityDistanceManager.printCitiesData();
//
//        Scanner keyboard = new Scanner(System.in);
//        System.out.print("\nPlease enter first city name:");
//        String city1 = keyboard.nextLine();
//        System.out.print("Please enter second city name:");
//        String city2 = keyboard.nextLine();
//
//        int distance = cityDistanceManager.findDistanceBetween(city1, city2);
//        System.out.println("Distance between " + city1 + " and " + city2 + " = " + distance);
//
//        System.out.print("\nEnter base city name:");
//        String baseCity = keyboard.nextLine();
//
//        String closestCity = cityDistanceManager.findClosestCityTo(baseCity);
//        System.out.println("Closest city to " + baseCity+" = " + closestCity);

    }
}
