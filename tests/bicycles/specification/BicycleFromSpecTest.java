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
    public void roadBikeTest(){

        // RoadBike

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);


        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();

        assertEquals(36, bicycle.currentSpeed());
    }

    @Test
    public void mountainBikeTest(){

        // Mountain Bike

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBikeSpec);
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();

        assertEquals(16, bicycle.currentSpeed());

    }

    @Test
    public void tandemBikeTest(){

        // Mountain Bike

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(tandemBikeSpec);
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();

        assertEquals(39, bicycle.currentSpeed());

    }

}
