package advanced1;

public class Car extends Vehicle{

    // New Field
    boolean awd;

    //Override method from Vehicle class
    public void vehicleSound(){
        System.out.println("BOOO");
    }

    // New method
    public void awdInfo(){
        System.out.println("AWD: " + awd);
    }

}
