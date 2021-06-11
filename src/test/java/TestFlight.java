import Flight.Flight;
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
    private Pilot pilot1;
    private CabinCrew cabinCrew1;
    private CabinCrew cabinCrew2;
    private ArrayList<Staff> crew;
    private ArrayList<Passenger> manifest;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private String flightNum;
    private String destination;
    private String departureAirport;
    private String departureTime;


    @Before
    public void setUp(){
        pilot1 = new Pilot("Colin", Rank.CAPTAIN, 12345);
        cabinCrew1 = new CabinCrew("Jules", Rank.FLIGHT_ATTENDANT);
        cabinCrew2 = new CabinCrew("Jen", Rank.FLIGHT_ATTENDANT);
        crew = new ArrayList<>();
        passenger1 = new Passenger("Mark", 1);
        passenger2 = new Passenger("Sarah", 1);
        passenger3 = new Passenger("Jill", 1);
        passenger4 = new Passenger("Chris", 1);
        manifest = new ArrayList<>();
        flightNum = "SK4616";
        destination = "Stavanger";
        departureAirport = "ABZ";
        departureTime = "16:40";

        flight1 = new Flight(
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
}
