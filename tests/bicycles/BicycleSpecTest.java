package bicycles;

import bicycles.models.BicycleFromSpec;
import bicycles.models.BicycleSpecification;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BicycleSpecTest {

    @Test
    public void RoadBikeTest(){
        // RoadBike
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

//        System.out.println(bikeRide);
    }

    @Test
    public void MountainBikeTest(){
        // MountainBike
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRideOne mBikeRide = new BikeRideOne(mountainBike);
        mBikeRide.ride();
    }
}
