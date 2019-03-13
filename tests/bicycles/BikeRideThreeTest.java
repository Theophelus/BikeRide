package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideThreeTest {

    @Test
    public void TestingRoadBikeClass(){
        RoadBike bicycle = new RoadBike();
        BikeRideThree bike = new BikeRideThree(bicycle);
        bike.ride();
        System.out.println("Current Speed Of Road Bike is" + " " + bike.getCurrentSpeed());

        assertEquals(42, bike.getCurrentSpeed());
    }
    @Test
    public void TestingMountainBike(){
        MountainBike bicycle = new MountainBike();
        BikeRideThree bike  =  new BikeRideThree(bicycle);
        bike.ride();

        System.out.println("Current Speed Of Mountain Bike Is" + " " + bike.getCurrentSpeed());

        assertEquals(12, bike.getCurrentSpeed());
    }
    @Test
    public void TestingTandemBikeSpeed(){
        Tandem bicycle = new Tandem();
        BikeRideThree bike  = new BikeRideThree(bicycle);

        bike.ride();
        System.out.println("Current Speed Of Tandem Bike Is" + " " + bike.getCurrentSpeed());
        assertEquals(30,  bike.getCurrentSpeed());
    }
}

