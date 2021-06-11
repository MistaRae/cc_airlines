import Person.Staff.CabinCrew;
import Person.Staff.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCabinCrew {

    CabinCrew cabinCrew1;

    @Before
    public void setUp(){
        cabinCrew1 = new CabinCrew("Jules", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void cabinCrewHaveNames(){
        assertEquals("Jules", cabinCrew1.getName());
    }

    @Test
    public void cabinCrewHAveARank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrew1.getRankFromStaff());
    }

    @Test
    public void cabinCrewCanMakeAnnouncement(){
        assertEquals("Please take your seats for landing", cabinCrew1.makeAnnouncement("Please take your seats for landing"));
    }

}
