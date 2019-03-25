package bicycles.rides;

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
            System.out.println("Bicycle" + " " + bicycles.size() + " " +  "Bicycle Accept");
        }
        else
            System.out.println("Fun Ride Is Full No More Bikes Are Accepted");
    }

    public int getCountForType(BicycleType bicycleType){
        /*
    Define method called getCountforType
    that take in BicycleType and parameter
    use a forEach loop to loop through the list of Bicycle Objects
    check Bicycle list == bicycleType if true increment the counter by 1
     */
        for (Bicycle bike: bicycles) {
            if (bike.bicycle() == bicycleType) {
                //increment the counter
                count+= 1;
            }
        }
        return count;
    }
    //Define a Getter Method to return the size() of the list Of Bicycles
    public int getEnteredCount(){
        return bicycles.size();
    }
}

