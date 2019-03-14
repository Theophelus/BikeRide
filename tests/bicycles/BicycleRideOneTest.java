package bicycles;


import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleRideOneTest {

    @Test
    public void TestingRoadBikeClass(){
        RoadBike bicycle = new RoadBike();
        BikeRideOne bike = new BikeRideOne(bicycle);
        bike.ride();
        System.out.println("Current SpeedOf Road Bike is" + " " + bike.getCurrentSpeed());

        assertEquals(36, bike.getCurrentSpeed());
    }
    @Test
    public void TestingMountainBike(){
        MountainBike bicycle = new MountainBike();
        BikeRideOne bike  =  new BikeRideOne(bicycle);
        bike.ride();

        System.out.println("Current Speed Of Mountain Bike Is" + " " + bike.getCurrentSpeed());

        assertEquals(14, bike.getCurrentSpeed());
    }
    @Test
    public void TestingTandemBikeSpeed(){
        Tandem bicycle = new Tandem();
        BikeRideOne bike  = new BikeRideOne(bicycle);

        bike.ride();
        System.out.println("Current Speed Of Tandem Bike Is" + " " + bike.getCurrentSpeed());
        assertEquals(34,  bike.getCurrentSpeed());
    }
}
