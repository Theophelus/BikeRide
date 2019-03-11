package bicycles;


import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

    @Test
    public void shouldAccelerate(){
        RoadBike bicycle = new RoadBike();
        BicycleRide bike = new BicycleRide(bicycle);
        bike.ride();


        assertEquals(36, bike.getCurrentSpeed());
    }
}
