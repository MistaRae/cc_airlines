import Flight.Flight;
import Flight.Plane.Plane;
import Flight.Plane.PlaneType;
import Person.Passenger.Passenger;
import Person.Staff.CabinCrew;
import Person.Staff.Pilot;
import Person.Staff.Rank;
import Person.Staff.Staff;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestFlight {

    private Flight flight1;
    private Plane plane;
    private Pilot pilot1;
    private CabinCrew cabinCrew1;
    private CabinCrew cabinCrew2;
    private ArrayList<Staff> crew;
    private ArrayList<Passenger> manifest;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Passenger passenger5;
    private Passenger passenger6;
    private Passenger passenger7;
    private Passenger passenger8;
    private Passenger passenger9;
    private Passenger passenger10;
    private Passenger passenger11;
    private String flightNum;
    private String destination;
    private String departureAirport;
    private String departureTime;


    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747);
        pilot1 = new Pilot("Colin", Rank.CAPTAIN, 12345);
        cabinCrew1 = new CabinCrew("Jules", Rank.FLIGHT_ATTENDANT);
        cabinCrew2 = new CabinCrew("Jen", Rank.FLIGHT_ATTENDANT);
        crew = new ArrayList<>();
        passenger1 = new Passenger("Mark", 1);
        passenger2 = new Passenger("Sarah", 1);
        passenger3 = new Passenger("Jill", 1);
        passenger4 = new Passenger("Chris", 1);
        passenger5 = new Passenger("Allan", 1);
        passenger6 = new Passenger("John", 1);
        passenger7 = new Passenger("Dan", 1);
        passenger8 = new Passenger("Gordon", 1);
        passenger9 = new Passenger("Aaron", 1);
        passenger10 = new Passenger("Holly", 1);
        passenger11 = new Passenger("Steven", 1);
        manifest = new ArrayList<>();
        flightNum = "SK4616";
        destination = "Stavanger";
        departureAirport = "ABZ";
        departureTime = "16:40";

        flight1 = new Flight(
                plane,
                pilot1,
                crew,
                manifest,
                flightNum,
                destination,
                departureAirport,
                departureTime);
    }

    @Test
    public void flightHasPilot(){
       assertEquals("Colin", pilot1.getName());
    }

    @Test
    public void flightCrewStartsEmpty(){
        assertEquals(0, crew.size());
    }

    @Test
    public void flightCanAddToCrew(){
        crew.add(pilot1);
        crew.add(cabinCrew1);
        crew.add(cabinCrew2);
        assertEquals(3, crew.size());
    }

    @Test
    public void flightManifestStartsEmpty(){
        assertEquals(0, manifest.size());
    }

    @Test
    public void flightCanAddToManifest(){
        manifest.add(passenger1);
        manifest.add(passenger2);
        assertEquals(2, manifest.size());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("Stavanger", flight1.getDestination());
    }

    @Test
    public void flightHasDepartureAirport(){
        assertEquals("ABZ", flight1.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("16:40", flight1.getDepartureTime());
    }

    @Test
    public void flightCanReturnTheNumberOfSeats(){
        assertEquals(10, flight1.getAvailableSeats());
    }

    @Test
    public void flightCanReturnTheNumberOfSeatsWithPassengersBooked(){
        flight1.addToManifest(passenger1);
        assertEquals(9, flight1.getAvailableSeats());
    }
    @Test
    public void flightCanReturnTheNumberOfSeatsWhenHalfFull(){
        flight1.addToManifest(passenger1);
        flight1.addToManifest(passenger2);
        flight1.addToManifest(passenger3);
        flight1.addToManifest(passenger4);
        assertEquals(6, flight1.getAvailableSeats());
    }

    @Test
    public void flightCantSurpassCapacity(){
        flight1.addToManifest(passenger1);
        flight1.addToManifest(passenger2);
        flight1.addToManifest(passenger3);
        flight1.addToManifest(passenger4);
        flight1.addToManifest(passenger5);
        flight1.addToManifest(passenger6);
        flight1.addToManifest(passenger7);
        flight1.addToManifest(passenger8);
        flight1.addToManifest(passenger9);
        flight1.addToManifest(passenger10);
        flight1.addToManifest(passenger11);
        assertEquals(0, flight1.getAvailableSeats());
    }
}
