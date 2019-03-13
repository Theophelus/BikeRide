package bicycles;


import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

    @Test
    public void TestingRoadBikeClass(){
        RoadBike bicycle = new RoadBike();
        BikeRide bike = new BikeRideOne(bicycle);
        bike.ride();

        System.out.println("Current Speed Expected For RoadBike is" + " " + bike.getCurrentSpeed());

        assertEquals(36, bike.getCurrentSpeed());
    }
   /* @Test
    public void TestingMountainBike(){
        MountainBike bicycle = new MountainBike();
        BikeRide bike = new BikeRide(bicycle);
        bike.ride();

        System.out.println(bike.getCurrentSpeed());

        assertEquals(14, bike.getCurrentSpeed());
    }
    @Test
    public void TestingTandemBikeSpeed(){
        Tandem bicycle = new Tandem();
        BikeRide bike  = new BikeRide(bicycle);

        bike.ride();
        System.out.println(bike.getCurrentSpeed());
        assertEquals(34,  bike.getCurrentSpeed());
    }
    */
}
