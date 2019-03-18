package bicycles;

import bicycles.models.BicycleFromSpec;
import bicycles.models.BicycleSpecification;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BicycleSpecTest {

    @Test
    public void RoadBikeTest(){

        // RoadBike

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bike = new BikeRideOne(bicycle);

        bike.ride();

        System.out.println("Current Speed of Road Bike is" + " " +  bike.getCurrentSpeed());

        assertEquals(36, bike.getCurrentSpeed());



    }

    @Test
    public void MountainBikeTest(){

        // Mountain Bike

        BicycleSpecification roadBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bike = new BikeRideOne(bicycle);

        bike.ride();

        System.out.println("Current mountain Bike is" + " " +  bike.getCurrentSpeed());

        assertEquals(14, bike.getCurrentSpeed());


    }

    @Test
    public void TandemBikeTest(){

        // Mountain Bike

        BicycleSpecification roadBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bike = new BikeRideOne(bicycle);

        bike.ride();

        System.out.println("Current Tandem Bike is" + " " +  bike.getCurrentSpeed());

        assertEquals(34, bike.getCurrentSpeed());

    }

}
