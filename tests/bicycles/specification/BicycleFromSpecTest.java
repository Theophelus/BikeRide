package bicycles.specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.rides.BikeRideOne;
import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BicycleFromSpecTest {

    @Test
    public void RoadBikeTest(){

        // RoadBike

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bike = new BikeRideOne(bicycle);
        bike.ride();
        assertEquals(36, bike.getCurrentSpeed());
    }

    @Test
    public void MountainBikeTest(){

        // Mountain Bike

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        BikeRideOne bike = new BikeRideOne(bicycle);
        bike.ride();
        assertEquals(14, bike.getCurrentSpeed());


    }

    @Test
    public void TandemBikeTest(){

        // Mountain Bike

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(tandemBikeSpec);
        BikeRideOne bike = new BikeRideOne(bicycle);
        bike.ride();
        assertEquals(34, bike.getCurrentSpeed());

    }

}
