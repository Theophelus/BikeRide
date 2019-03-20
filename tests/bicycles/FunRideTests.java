package bicycles;

import bicycles.models.BicycleFromSpec;
import bicycles.models.BicycleSpecification;
import bicycles.models.FunRide;
import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTests {


    @Test
    public void TestingRoadBikeThroughFunRide(){

        //Road Bike

        FunRide funRide = new FunRide(5);
        BicycleSpecification roadBikeSpecs = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpecs);
        Bicycle bicycle2 = new BicycleFromSpec(roadBikeSpecs);
        Bicycle bicycle3 = new BicycleFromSpec(roadBikeSpecs);
        Bicycle bicycle4 = new BicycleFromSpec(roadBikeSpecs);
        Bicycle bicycle5 = new BicycleFromSpec(roadBikeSpecs);
        Bicycle bicycle6 = new BicycleFromSpec(roadBikeSpecs);

        funRide.Accept(bicycle);
        funRide.Accept(bicycle2);
        funRide.Accept(bicycle3);
        funRide.Accept(bicycle4);
        funRide.Accept(bicycle5);
//        funRide.Accept(bicycle6);

        assertEquals(funRide.getEnteredCount(), funRide.getCountForType(BicycleType.RoadBike));
    }

    @Test
    public void TestingMountainBikeThroughFunRide(){

        //Mountain Bike

        FunRide funRide = new FunRide(2);
        BicycleSpecification roadBikeSpecs = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpecs);
        Bicycle bicycle2 = new BicycleFromSpec(roadBikeSpecs);

        funRide.Accept(bicycle);
        funRide.Accept(bicycle2);

        assertEquals(2, funRide.getEnteredCount());
    }

    @Test
    public void TestingTandemBikeThroughFunRide(){

        //Tandem Bike

        FunRide funRide = new FunRide(2);
        BicycleSpecification roadBikeSpecs = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpecs);
        Bicycle bicycle2 = new BicycleFromSpec(roadBikeSpecs);

        funRide.Accept(bicycle);
        funRide.Accept(bicycle2);

        assertEquals(2, funRide.getEnteredCount());
    }
}
