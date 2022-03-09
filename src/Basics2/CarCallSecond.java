package Basics2;

public class CarCallSecond {
    public static void main(String[] args) {

        CarSecond car1 = new CarSecond();

        // Use setter methods to set object field values

        car1.setColor("Black");
        car1.setBrand("Opel");
        car1.setMaxSpeed(60);

        car1.carInfo();

    }
}
