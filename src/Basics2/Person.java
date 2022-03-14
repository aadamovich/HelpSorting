package Basics2;

public class Person {
    // Fields

   private String name;
    private String gender;
    private int age;
    private float height;
    private String nationality;
    private boolean status;

    // Custom constructor

    public Person(String name, String gender, int age, float height, String nationality){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.nationality = nationality;
    }

    public Person(){

    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void personInfo(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Nationality: " + nationality);
        System.out.println("Status: " + status);
    }
}
