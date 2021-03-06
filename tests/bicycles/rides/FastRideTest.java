package bicycles.rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FastRideTest {

    @Test
    public void testingMountainBikeClass(){

        //Mountain Bike

        MountainBike bicycle = new MountainBike();
        FastRide bike = new FastRide(bicycle);

        bike.ride();

        assertEquals(36, bike.getCurrentSpeed());
    }

    @Test
    public void testingRoadBikeClass(){

        //Road Bike

        RoadBike bicycle = new RoadBike();
        FastRide bike = new FastRide(bicycle);
        bike.ride();
        assertEquals(87, bike.getCurrentSpeed());
    }

    @Test
    public void testingTandemBikeClass(){

        //Tandem Bike

        Tandem bicycle = new Tandem();
        FastRide bike = new FastRide(bicycle);
        bike.ride();
        assertEquals(87, bike.getCurrentSpeed());
    }



}
