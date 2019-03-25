package bicycles.rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SlowRideTest {

    @Test
    public void TestingRoadBikeClass(){
        RoadBike bicycle = new RoadBike();
        SlowRide bike = new SlowRide(bicycle);
        bike.ride();
        System.out.println("Current Speed Of Road Bike is" + " " + bike.getCurrentSpeed());

        assertEquals(42, bike.getCurrentSpeed());
    }
    @Test
    public void TestingMountainBike(){
        MountainBike bicycle = new MountainBike();
        SlowRide bike  =  new SlowRide(bicycle);
        bike.ride();

        System.out.println("Current Speed Of Mountain Bike Is" + " " + bike.getCurrentSpeed());

        assertEquals(12, bike.getCurrentSpeed());
    }
    @Test
    public void TestingTandemBikeSpeed(){
        Tandem bicycle = new Tandem();
        SlowRide bike  = new SlowRide(bicycle);

        bike.ride();
        System.out.println("Current Speed Of Tandem Bike Is" + " " + bike.getCurrentSpeed());
        assertEquals(30,  bike.getCurrentSpeed());
    }
}

