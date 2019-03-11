package bicycles;


import models.MountainBike;
import models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

    @Test
    public void TestingRoadBikeClass(){
        RoadBike bicycle = new RoadBike();
        BicycleRide bike = new BicycleRide(bicycle);
        bike.ride();


        assertEquals(36, bike.getCurrentSpeed());
    }
    @Test
    public void TestingMountainBike(){
        MountainBike bicycle = new MountainBike();
        BicycleRide bike = new BicycleRide(bicycle);
        bike.ride();

        assertEquals(16, bike.getCurrentSpeed());
    }
}
