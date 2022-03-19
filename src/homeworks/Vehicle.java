package homeworks;

// Class definition
 class Vehicle {

  // Fields (attributes)
  private float fuel;
  private float fuelUsage;
  private int passenger;

  // Custom constructor with input parameters (next arguments)
  public Vehicle(float fuel, float fuelUsage, int passenger) {

   // Assign values
   this.fuel = fuel;
   this.fuelUsage = fuelUsage;
   this.passenger = passenger;
  }

  // Create method in Vehicle class that calculate distance value
  public void maxDistance() {

   // Calculate max distance
   float maxDistance = (float) ((fuel / fuelUsage + ((fuelUsage * (passenger * 0.05))))*100);
   // Formatting value to two decimal places and returning max value
   System.out.printf("Max distance: %.2f km\n",maxDistance);
  }
 }

