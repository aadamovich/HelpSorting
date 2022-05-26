package homeworks;

// Create a subclass (or Child class) that extends (or inherits) Vehicle class
 class Car extends Vehicle{

    boolean airConditioner;

    // Create custom Constructor
    public Car (float fuel, float fuelUsage, int passenger, boolean airConditioner){
        super(fuel,fuelUsage,passenger);
        this.airConditioner = airConditioner;
    }

    // Override method in Car class that calculate distance value with included airConditioner value
    public void maxDistance() {

        float newFuelUsage = (float)(getFuelUsage() + (getFuelUsage() * getPassenger() * 0.05));

        // Calculate max distance taking in account airConditioner or without it
        if(airConditioner){
            float maxDistance =  (float) ((getFuel() /(newFuelUsage + (newFuelUsage * 0.1)) * 100));
            System.out.printf("Max distance with air conditioner: %.2f km\n", maxDistance);
        } else {
            float maxDistance = (float) (getFuel() / newFuelUsage * 100.00);
            System.out.printf("Max distance without air conditioner: %.2f km\n", maxDistance);
            // Return calculated distance with 2 decimal points
        }
    }
}