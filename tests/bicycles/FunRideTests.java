package bicycles;

import bicycles.specification.BicycleFromSpec;
import bicycles.specification.BicycleSpecification;
import bicycles.rides.FunRide;
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

        funRide.accept(bicycle);
        funRide.accept(bicycle2);
        funRide.accept(bicycle3);
        funRide.accept(bicycle4);
        funRide.accept(bicycle5);
        funRide.accept(bicycle6);

        assertEquals(funRide.getEnteredCount(), funRide.getCountForType(BicycleType.RoadBike));
    }

    @Test
    public void TestingMountainBikeThroughFunRide(){

        //Mountain Bike

        FunRide funRide = new FunRide(2);
        BicycleSpecification mountainBikeSpecs = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle MountainBike = new BicycleFromSpec(mountainBikeSpecs );
        Bicycle MountainBike2 = new BicycleFromSpec(mountainBikeSpecs);

        funRide.accept(MountainBike);
        funRide.accept(MountainBike2);


        assertEquals(funRide.getEnteredCount(), funRide.getCountForType(BicycleType.MountainBike));
    }

    @Test
    public void TestingTandemBikeThroughFunRide(){

        //Tandem Bike

        FunRide funRide = new FunRide(4);
        BicycleSpecification TandemBikeSpecs = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(TandemBikeSpecs );
        Bicycle tandem2 = new BicycleFromSpec(TandemBikeSpecs );
        Bicycle tandem3 = new BicycleFromSpec(TandemBikeSpecs );
        Bicycle tandem4 = new BicycleFromSpec(TandemBikeSpecs );

        funRide.accept(tandem);
        funRide.accept(tandem2);
        funRide.accept(tandem3);
        funRide.accept(tandem4);

        assertEquals(funRide.getEnteredCount(), funRide.getCountForType(BicycleType.Tandem));
    }
}
