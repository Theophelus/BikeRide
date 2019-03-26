package bicycles.specification;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.rides.BikeRideOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecTest {

    @Test
    public void RoadBikeTest(){

        // RoadBike

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        System.out.println(roadBikeSpec.getAccelerationSpeed());
        System.out.println(roadBikeSpec.getBrake());
        System.out.println(roadBikeSpec.getBicycleType());
    }

    @Test
    public void MountainBikeTest(){

        // Mountain Bike

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        System.out.println(mountainBikeSpec.getAccelerationSpeed());
        System.out.println(mountainBikeSpec.getBrake());
        System.out.println(mountainBikeSpec.getBicycleType());


    }

    @Test
    public void TandemBikeTest(){

        // Mountain Bike

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        System.out.println(tandemBikeSpec.getAccelerationSpeed());
        System.out.println(tandemBikeSpec.getBrake());
        System.out.println(tandemBikeSpec.getBicycleType());

    }
}


