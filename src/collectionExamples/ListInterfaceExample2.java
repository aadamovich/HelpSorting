package collectionExamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterfaceExample2 {
    public static void main(String[] args) {

        // Example1

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("List: " + list);

        List<Integer> list2 = new ArrayList<Integer>(list);
        System.out.println("List2: " + list2);

        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(5);
        list3.add(6);

        list3.addAll(0,list2);
        System.out.println("List3: " + list3);

        // Example 2

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Topic 1");
        arrayList.add("Topic 2");
        arrayList.add("Topic 3");

        arrayList.add(2, "Topic 2.1");

        System.out.println(arrayList);

        // Regular for loop

        for(int i = 0; i < arrayList.size() ;i++){
            System.out.println(arrayList.get(i));
        }

        // Or for each loop

        for(String i : arrayList){
            System.out.println("For each loop: " + i);
        }

        //LinkedList

        LinkedList<String> car = new LinkedList<String>();
        car.add("Volvo");
        car.addFirst("Opel");
        car.add("Audi");
        System.out.println("Car: " + car);
        System.out.println(car.getLast());

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for(int i = 1; i <= 100; i++){
            linkedList.add(i);
        }
        System.out.println("Linkedlist " + linkedList);


    }
}
