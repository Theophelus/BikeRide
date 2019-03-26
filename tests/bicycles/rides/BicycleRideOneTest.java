package bicycles.rides;


import bicycles.rides.BikeRideOne;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleRideOneTest {

    @Test
    public void TestingRoadBikeClass(){

        //Road Bike

        RoadBike bicycle = new RoadBike();
        BikeRideOne bike = new BikeRideOne(bicycle);
        bike.ride();
        assertEquals(36, bike.getCurrentSpeed());
    }
    @Test
    public void TestingMountainBike(){

        //Mountain Bike

        MountainBike bicycle = new MountainBike();
        BikeRideOne bike  =  new BikeRideOne(bicycle);
        bike.ride();
        assertEquals(14, bike.getCurrentSpeed());
    }
    @Test
    public void TestingTandemBike(){

        //Tandem Bike

        Tandem bicycle = new Tandem();
        BikeRideOne bike  = new BikeRideOne(bicycle);
        bike.ride();
        assertEquals(34,  bike.getCurrentSpeed());
    }
}
