package homeworks;

public class RunVehicle {
    public static void main(String[] args) {

        // Create instances of Vehicle class (or create 2 objects) and pass values
        Vehicle vehicle = new Vehicle(100,3.5f,0);
        Vehicle vehicle1 = new Vehicle(100,4.7f,3);

        // Call methods for each object
        vehicle.maxDistance();
        vehicle1.maxDistance();

    }
}
