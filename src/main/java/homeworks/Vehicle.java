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

 public float getFuel() {return fuel;}
 public float getFuelUsage() {return fuelUsage;}
 public int getPassenger() {return passenger;}

 // Create method in Vehicle class that calculate distance value
  public void maxDistance() {
   // Calculate max distance
   float maxDistance = (float) (fuel / (fuelUsage + (fuelUsage * passenger * 0.05)) * 100.00);
   // Formatting value to two decimal places and returning max value
   System.out.printf("Max distance: %.2f km\n",maxDistance);
  }
 }

 //Trainer Example

/*
public class Vehicle {

 //Fields
 protected float fuel;
 protected float fuelUsage;
 protected int passengers;

 //Constructor
 public Vehicle (float fuel, float fuelUsage, int passengers){
  this.fuel = fuel;
  this.fuelUsage = fuelUsage;
  this.passengers = passengers;
 }

 public float maxDistance(){
  return fuel / (fuelUsage * (1 + passengers * 0.05f)) * 100;
 }

}

import java.util.Scanner;

public class VehicleCall {
 public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);

  System.out.println("Enter fuel amount in your vehicle");
  float fuel = scanner.nextFloat();

  System.out.println("Enter your vehicle's fuel usage per 100km");
  float fuelUsage = scanner.nextFloat();

  System.out.println("Enter how many passengers will be in the vehicle");
  int passengers = scanner.nextInt();

  Vehicle vehicle1 = new Vehicle(fuel, fuelUsage, passengers);
  System.out.printf("Your vehicle can drive maximum of %.2f kilometers.", vehicle1.maxDistance());
 }
}

public class Car extends Vehicle{

 //Field
 boolean airConditioner;

 public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner){
  super(fuel,fuelUsage,passengers);
  this.airConditioner = airConditioner;
 }

 public float maxDistance(){
  float airConditionerAdd;

  if (airConditioner){
   airConditionerAdd = 1.1f;
  }else {
   airConditionerAdd = 1f;
  }

  float usage = fuelUsage * (1 + passengers * 0.05f);
  return fuel / (usage * airConditionerAdd) * 100;

 }

}

public class CarCall {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  System.out.println("Enter fuel amount in your vehicle");
  float fuel = scanner.nextFloat();

  System.out.println("Enter your vehicle's fuel usage per 100km");
  float fuelUsage = scanner.nextFloat();

  System.out.println("Enter how many passengers will be in the vehicle");
  int passengers = scanner.nextInt();

  System.out.println("Will you turn in air conditioner? y/n");
  char input = scanner.next().charAt(0);
  boolean airConditioner = false;
  if(input == 'y'){
   airConditioner = true;
  }else if(input == 'n'){
   airConditioner = false;
  }else{
   System.out.println("Please enter y or n");
  }

  Car car1 = new Car(fuel,fuelUsage,passengers,airConditioner);
  System.out.printf("Your vehicle can drive maximum of %.2f kilometers.", car1.maxDistance());


 }
}
*/

