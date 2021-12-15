package dkit.oop;

import java.util.ArrayList;
import java.util.List;

public class PassengerAirplane extends Airplane {

    // fields(Q2)
    private final int MAX_NUM_PASSENGERS;
    private ArrayList<String> passengerList;



    PassengerAirplane(String type, int MAX_NUM_PASSENGERS) {

        // code here
        super(type);
        this.MAX_NUM_PASSENGERS = MAX_NUM_PASSENGERS;

    }

    public void addPassenger(String name) {
        // code here
        if(this.MAX_NUM_PASSENGERS <MAX_NUM_PASSENGERS)
        passengerList.add(name);

    }
    @Override
    public String toString() {
        return "PassengerAirplane{" +
                "MAX_NUM_PASSENGERS=" + MAX_NUM_PASSENGERS +
                ", passengerList=" + passengerList +
                '}';
    }

} // end of PassengerAirplane
