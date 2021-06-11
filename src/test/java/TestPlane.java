import Flight.Plane.Plane;
import Flight.Plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlane {

    Plane plane1;

    @Before
    public void setUp(){
        plane1 = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void planesHaveCapacity(){
        assertEquals(10, plane1.getCapacityFromEnum());
    }

    @Test
    public void planesHaveATotalWeight(){
        assertEquals(100, plane1.getTotalWeightFromEnum());
    }

    @Test
    public void planesHavePlaneType(){
        assertEquals(PlaneType.BOEING747, plane1.getPlaneType());
    }

}
