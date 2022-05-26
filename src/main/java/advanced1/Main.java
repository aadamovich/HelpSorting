package advanced1;

public class Main {
    public static void main(String[] args) {

        // Create Vehicle class
        Vehicle vehicle1 = new Vehicle();
        vehicle1.passengerCount = 1;
        vehicle1.range = 467.8d;
        vehicle1.fuelType = "Diesel";
        vehicle1.automatic = true;
       // vehicle1.awd = true; you can't reach vehicle1.awd from main
      //  vehicle1.awdInfo();

        vehicle1.vehicleSound();
        vehicle1.vehicleInfo();

        // Create Car class object

        Car car1 = new Car();

        car1.vehicleSound();
        car1.passengerCount = 2;
        car1.fuelType = "Petrol";
        car1.range = 134.6d;
        car1.automatic = false;

        car1.awd = true;

        car1.vehicleInfo();
        car1.awdInfo();

        Animal animal = new Animal();
        System.out.println(animal.getName());

        Pig pig1 = new Pig();
        pig1.info();

    }
}
