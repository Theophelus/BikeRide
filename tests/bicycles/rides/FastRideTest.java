package bicycles.rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FastRideTest {

    @Test
    public void TestingMountainBikeClass(){
        MountainBike bicycle = new MountainBike();
        FastRide bike = new FastRide(bicycle);

        bike.ride();
        System.out.println("Current Speed Of Mountain Bike Is" + " " + bike.getCurrentSpeed());

        assertEquals(36, bike.getCurrentSpeed());
    }

    @Test
    public void TestingRoadBikeClass(){
        RoadBike bicycle = new RoadBike();
        FastRide bike = new FastRide(bicycle);

        bike.ride();
        System.out.println("Current Speed Of Road Bike Is" + " " + bike.getCurrentSpeed());

        assertEquals(87, bike.getCurrentSpeed());
    }

    @Test
    public void TestingTandemBikeClass(){
        Tandem bicycle = new Tandem();
        FastRide bike = new FastRide(bicycle);

        bike.ride();
        System.out.println("Current Speed Of Tandem Bike Is" + " " + bike.getCurrentSpeed());

        assertEquals(87, bike.getCurrentSpeed());
    }



}
