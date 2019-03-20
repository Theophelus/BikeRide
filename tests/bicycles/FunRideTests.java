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
        BicycleSpecification mountainBikeSpecs = new BicycleSpecification(11, -4, BicycleType.MountainBike);
        Bicycle MountainBike = new BicycleFromSpec(mountainBikeSpecs );
        Bicycle MountainBike2 = new BicycleFromSpec(mountainBikeSpecs);

        funRide.Accept(MountainBike);
        funRide.Accept(MountainBike2);


        assertEquals(funRide.getEnteredCount(), funRide.getCountForType(BicycleType.MountainBike));
    }

    @Test
    public void TestingTandemBikeThroughFunRide(){

        //Tandem Bike

        FunRide funRide = new FunRide(4);
        BicycleSpecification TandemBikeSpecs = new BicycleSpecification(11, -4, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(TandemBikeSpecs );
        Bicycle tandem2 = new BicycleFromSpec(TandemBikeSpecs );
        Bicycle tandem3 = new BicycleFromSpec(TandemBikeSpecs );
        Bicycle tandem4 = new BicycleFromSpec(TandemBikeSpecs );

        funRide.Accept(tandem);
        funRide.Accept(tandem2);
        funRide.Accept(tandem3);
        funRide.Accept(tandem4);

        assertEquals(funRide.getEnteredCount(), funRide.getCountForType(BicycleType.Tandem));
    }
}
