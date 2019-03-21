package bicycles;

import bicycles.BicycleRides.BikeRideTwo;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BikeRideTwoTest {

    @Test
    public void TestingRoadBikeClass(){
        RoadBike bicycle = new RoadBike();
        BikeRideTwo bike = new BikeRideTwo(bicycle);

        bike.ride();
        System.out.println("Current Speed Of Road Bike Is" + " " + bike.getCurrentSpeed());

        assertEquals(54, bike.getCurrentSpeed());
    }

    @Test
    public void TestingMountainBikeClass(){
        MountainBike bicycle = new MountainBike();
        BikeRideTwo bike = new BikeRideTwo(bicycle);

        bike.ride();
        System.out.println("Current Speed Of Mountain Bike Is" + " " + bike.getCurrentSpeed());

        assertEquals(21, bike.getCurrentSpeed());
    }

    @Test
    public void TestingTandemBikeClass(){
        Tandem bicycle = new Tandem();
        BikeRideTwo bike = new BikeRideTwo(bicycle);

        bike.ride();
        System.out.println("Current Speed Of Tandem Bike Is" + " " + bike.getCurrentSpeed());

        assertEquals(51, bike.getCurrentSpeed());
    }



}
