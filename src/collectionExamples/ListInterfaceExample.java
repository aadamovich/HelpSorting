package collectionExamples;

import java.util.ArrayList;

public class ListInterfaceExample {
    public static void main(String[] args) {

        // Array list

        ArrayList<String> car = new ArrayList<String >();
      //  List<String> car = new ArrayList<String >(); - can write as well like this

        //Add values
        car.add("Volvo");
        car.add("Mercedes");
        car.add("BMV");
        car.add("Jeep");
        car.add("Opel");

        System.out.println(car);
        System.out.println(car.get(0));

        //Add element at specific index (will add to list and other elements will have index +1 and array size will be +1)
        car.add(0,"Dacia");
        System.out.println(car);

        // Change element
        car.set(3,"Audi");
        System.out.println(car);

        // Size
        System.out.println(car.size());

        // Remove elements by index
        car.remove(5);
        System.out.println(car);

        //Delete all elements
        car.clear();
        System.out.println(car);

    }
}
