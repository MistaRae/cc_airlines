import Person.Passenger.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPassenger {

    private Passenger passenger1;

    @Before
    public void setUp(){
        passenger1 = new Passenger("Mark", 1);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Mark", passenger1.getName());
    }

    @Test
    public void passengerHasBags(){
        assertEquals(1, passenger1.getNumOfBags());
    }

}
