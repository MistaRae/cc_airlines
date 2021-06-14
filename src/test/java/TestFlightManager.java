import Person.Passenger.Passenger;
import Person.Staff.FlightManager;
import Person.Staff.Rank;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestFlightManager {

    private FlightManager flightManager;
    private Passenger passenger1;
    private Passenger passenger2;
    private ArrayList<Passenger> manifest;


    @Before
    public void setUp(){
        passenger1 = new Passenger("Mark", 1);
        passenger2 = new Passenger("Sarah", 10);
        flightManager = new FlightManager("Tony", Rank.FLIGHT_ATTENDANT);
        manifest.add(passenger1);
        manifest.add(passenger2);
    }

    @Test
    public void flightManagerCanCalculateBaggageWeightRequiredForEachPassenger(){
        assertEquals(10, flightManager.calculateCustomerBaggageWeight(passenger1));
    }

    @Test
    public void flightManagerCanGetBookedWeight(){
        assertEquals(90, flightManager.getBookedWeight(manifest));
    }


}
