package bicycles.rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SlowRideTest {

    @Test
    public void testingRoadBikeClass(){

        //Road Bike

        RoadBike bicycle = new RoadBike();
        SlowRide bike = new SlowRide(bicycle);
        bike.ride();
        assertEquals(42, bike.getCurrentSpeed());
    }
    @Test
    public void testingMountainBike(){

        //Mountain Bike

        MountainBike bicycle = new MountainBike();
        SlowRide bike  =  new SlowRide(bicycle);
        bike.ride();
        assertEquals(12, bike.getCurrentSpeed());
    }
    @Test
    public void testingTandemBikeSpeed(){

        //Tandem Bike

        Tandem bicycle = new Tandem();
        SlowRide bike  = new SlowRide(bicycle);
        bike.ride();
        assertEquals(30,  bike.getCurrentSpeed());
    }
}

