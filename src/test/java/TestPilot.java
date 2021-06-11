import Person.Staff.Pilot;
import Person.Staff.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPilot {

    Pilot pilot1;
    Pilot pilot2;
    Pilot pilot3;


    @Before
    public void setUp(){
        pilot1 = new Pilot("Colin", Rank.CAPTAIN, 12345);
        pilot2 = new Pilot("Hannah", Rank.FIRST_OFFICER, 12346);
        pilot3 = new Pilot("Roosa", Rank.SECOND_OFFICER, 12347);
    }

    @Test
    public void pilotsHaveNames(){
        assertEquals("Colin", pilot1.getName());
    }

    @Test
    public void pilotsHaveARank(){
        assertEquals(Rank.FIRST_OFFICER, pilot2.getRank());
    }

    @Test
    public void pilotsHaveAPay(){
        assertEquals(350, pilot3.getPayFromStaff());
    }

    @Test
    public void pilotsHaveALicenceNum(){
        assertEquals(12345, pilot1.getLicenceNo());
    }

}
