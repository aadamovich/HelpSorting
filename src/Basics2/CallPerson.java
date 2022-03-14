package Basics2;

public class CallPerson {
    public static void main(String[] args) {

        // Create Person object
        Person p1 = new Person("Alise", "Male", 45, 1.78f, "Latvian");

        p1.personInfo();
        p1.setStatus(true);

        Person p2 = new Person();
        p2.personInfo();

    }
}
