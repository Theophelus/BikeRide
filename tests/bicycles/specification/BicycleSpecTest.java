package bicycles.specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.rides.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecTest {

    @Test
    public void roadBikeTest(){

        // RoadBike

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        assertEquals(11, roadBikeSpec.getAccelerationSpeed());
        assertEquals(-4, roadBikeSpec.getBrake());
        assertEquals(roadBikeSpec.getBicycleType(), BicycleType.RoadBike);
    }

    @Test
    public void rountainBikeTest(){

        // Mountain Bike

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        assertEquals(5, mountainBikeSpec.getAccelerationSpeed());
        assertEquals(-3, mountainBikeSpec.getBrake());
        assertEquals(mountainBikeSpec.getBicycleType(), BicycleType.MountainBike);
    }

    @Test
    public void tandemBikeTest(){

        // Mountain Bike

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        assertEquals(12, tandemBikeSpec.getAccelerationSpeed());
        assertEquals(-7, tandemBikeSpec.getBrake());
        assertEquals(tandemBikeSpec.getBicycleType(), BicycleType.Tandem);

    }
}


