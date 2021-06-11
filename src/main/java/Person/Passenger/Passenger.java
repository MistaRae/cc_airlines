package Person.Passenger;

import Person.Person;
import Flight.Flight;

public class Passenger extends Person {

    private int numOfBags;
    private Flight flight;
    private int seatNumber;


    public Passenger(String name, int numOfBags) {
        super(name);
        this.numOfBags = numOfBags;
    }

    public int getNumOfBags() {
        return this.numOfBags;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }
}
