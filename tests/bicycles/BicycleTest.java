package bicycles;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

    @Test
    public void shouldAccelerate(){
        Bicycle bicycle = new Bicycle();
        BicycleRide bike = new BicycleRide(bicycle);
        bike.ride();


        assertEquals(14, bike.getCurrentSpeed());
    }
}
