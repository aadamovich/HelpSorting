package advanced1;

public class Vehicle {

    // Fields

    int passengerCount;
    String fuelType;
    double range;
    boolean automatic;

    // Methods

    public void vehicleSound(){
        System.out.println("Piii");
    }

    public void vehicleInfo(){
        System.out.println("Passenger count: " + passengerCount);
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Range: " + range);
        System.out.println("Automatic: " + automatic);
    }



}
