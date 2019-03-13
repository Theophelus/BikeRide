package bicycles;

import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

public class BikeRideTwoTest {

    @Test
    public void TestingRoadBikeClass(){
        RoadBike bicycle = new RoadBike();
        BikeRideTwo bike = new BikeRideTwo(bicycle);

        bike.ride();
        System.out.println("Current Bike speed is" + " " + bike.getCurrentSpeed());

    }

}
