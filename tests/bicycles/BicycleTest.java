package bicycles;


import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

    @Test
    public void TestingRoadBikeClass(){
        RoadBike bicycle = new RoadBike();
        BicycleRide bike = new BicycleRide(bicycle);
        bike.ride();
        System.out.println(bike.getCurrentSpeed());

        assertEquals(36, bike.getCurrentSpeed());
    }
    @Test
    public void TestingMountainBike(){
        MountainBike bicycle = new MountainBike();
        BicycleRide bike = new BicycleRide(bicycle);
        bike.ride();

        System.out.println(bike.getCurrentSpeed());

        assertEquals(14, bike.getCurrentSpeed());
    }
}
