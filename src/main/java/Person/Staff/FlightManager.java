package Person.Staff;

import Person.Passenger.Passenger;

import java.util.ArrayList;

public class FlightManager extends Staff {

    public FlightManager(String name, Rank rank) {
        super(name, rank);
    }

    public int calculateCustomerBaggageWeight(Passenger passenger) {
        int bags = passenger.getNumOfBags();
        int baggageWeight = bags * 10;
        return  baggageWeight;
    }

    public int getBookedWeight(ArrayList manifest) {
        Passenger passenger = null;
        int bookedWeight = 0;
        int count = 0;
//        manifest.forEach(passenger){
//            count += passenger.getNumOfBags();}
//        bookedWeight = count * 10;
//        return bookedWeight;
            for (passenger : manifest) {
            count += passenger.getNumOfBags();
        }
        bookedWeight = count * 10;
        return bookedWeight;

    }
}
