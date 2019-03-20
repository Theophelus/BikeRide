package bicycles.models;

import bicycles.Bicycle;
import bicycles.BicycleType;

import java.util.ArrayList;
import java.util.List;

public class FunRide {

    //Define a ArrayList to hold a list of Bicycle
    private List <Bicycle> bicycles = new ArrayList<>();

    //Define a variable to store maxNumberOfBikes and the counter
    private int maxNumOfBikes;
    public int count;

    //Define a constructor that take maximumNumber as a parameter
    public FunRide( int maxNumOfBikes){
        this.maxNumOfBikes = maxNumOfBikes;

    }

    //Define accept method here.
    public void Accept(Bicycle bicycle){
        /*Check if the maxNumberOfBikes is greater than the number length of Bicycle.
        if true add BICYCLE AS ARGUMENT to the BICYCLE LIST and
        print "Bicycle accepted"
        else print "Bicycle Not accepted
         */
        if (maxNumOfBikes > bicycles.size()) {
            bicycles.add(bicycle);
            System.out.println(bicycles.size() + "Bicycle Accept");
        }
        else
            System.out.println("bicycle Not Accepted");
    }
    
}
