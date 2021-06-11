import Person.Staff.FlightManager;
import Person.Staff.Rank;
import org.junit.Before;
import org.junit.Test;

public class TestFlightManager {

    private FlightManager flightManager;

    @Before
    public void setUp(){
        flightManager = new FlightManager("Tony", Rank.FLIGHT_ATTENDANT);
    }



}
