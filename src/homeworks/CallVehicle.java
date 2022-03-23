package homeworks;

public class CallVehicle {
    public static void main(String[] args) {

        // Create new Vehicle and Car classes instances or objects
        // Passing input parameters (arguments)
        Vehicle vehicle = new Vehicle(70.0f,7.0f,0);
        Vehicle vehicle1 = new Vehicle(55.5f,5.5f,5);
        Car car = new Car(70.0f,7.0f,0,true);
        Car car1 = new Car(36.1f,8.6f,3,true);
        Car car2 = new Car(70.0f,7.0f,0,false);

        // Calling methods
        vehicle.maxDistance();
        vehicle1.maxDistance();
        car.maxDistance();
        car1.maxDistance();
        car2.maxDistance();
    }
}
