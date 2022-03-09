package Basics2;

public class CarSecond {

    // Fields
    private String color; // String color is global variable
    private String brand;
    private int maxSpeed;

    // Setter methods

    public void setColor(String color) { // String color is local variable and not the same as global variable String color
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed >= 70 && maxSpeed <= 400){
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 150;
        }
    }

    // Getter methods

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void carInfo(){
        System.out.println("Car info: ");
        System.out.println("\t Color: " + color);
        System.out.println("\t Brand: " + brand);
        System.out.println("\t Maximum speed: " + maxSpeed);
    }


}
