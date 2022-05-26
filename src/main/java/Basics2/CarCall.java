package Basics2;

public class CarCall {
        public static void main(String[] args) {

            // Create car class object
            Car car1 = new  Car();

            // Calling car class object (car1) method (printInfo)
            car1.carInfo();

            // Setting car object  field values
            car1.color = "Red";
            car1.brand = "Mercedes";
            car1.maxSpeed = 220;

            car1.carInfo();

            // Creating another car class object
            Car car2 = new Car();

            car2.color = "Blue";
            car2.brand = "Audi";
            car2.maxSpeed = 200;

            car2.carInfo();
        }
}
