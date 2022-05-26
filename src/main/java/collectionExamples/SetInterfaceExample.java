package collectionExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterfaceExample {
    public static void main(String[] args) {

        String testValue = "This is test value";
        System.out.print(testValue.indexOf("is"));

        System.out.println();
   // Hashset
/*   Set<String> name = new HashSet<String>();

   // Add element
   name.add("Bob");
   name.add("Sara");
   name.add("John");

   // Print elements
        System.out.println("Original Hashset values: " + name);

   // Size of a Set
        System.out.println(name.size());

   // Remove elements
        name.remove("Bob");
        System.out.println("Hashset without 1 value: " + name);

    // Contains
        System.out.println(name.contains("Sara"));
        System.out.println(name.contains("Bob"));
        System.out.println();

     //Iterate
     // For each loop
     for (String i : name){
         System.out.println(i);
     }

     //Alternative (to Iteration with for loop)
        Iterator<String> i = name.iterator();
     while (i.hasNext()){
         System.out.println(i.next());
     }*/

   // Hashset example 2

   Set<Integer> intSet1 = new HashSet<Integer>();
   intSet1.add(1);
   intSet1.add(2);
   intSet1.add(3);
   intSet1.add(4);

   System.out.println("Set 1 values: " + intSet1);

   Set<Integer> intSet2 = new HashSet<Integer>();
   intSet2.add(3);
   intSet2.add(4);
   intSet2.add(5);
   intSet2.add(6);

   System.out.println("Set 2 values: " + intSet2);

   // Find union
   Set<Integer> union = new HashSet<Integer>(intSet1);
   System.out.println("Union Set: " + union);

   union.addAll(intSet2);
   System.out.println("Union Set after adding Set2: " + union);

   // Find intersection (kas pārklājas)
   Set<Integer> intersection = new HashSet<Integer>(intSet1);
   intersection.retainAll(intSet2);
   System.out.println("Intersection elements: " + intersection);

   //Find difference (find unique values and remove intersection values)
   Set<Integer> difference = new HashSet<Integer>(intSet1);
   difference.removeAll(intSet2);
   System.out.println("Unique elements in set1: " + difference);

   //LinkedHashSet

    Set<String> LinkedHashset = new LinkedHashSet<String>();
    LinkedHashset.add("Latvia");
    LinkedHashset.add("Finland");
    LinkedHashset.add("Poland");
    System.out.println(LinkedHashset);
    System.out.println(LinkedHashset);

    LinkedHashset.add("Poland");
    System.out.println(LinkedHashset);

    LinkedHashset.remove("Poland");
    System.out.println(LinkedHashset);


    }
}
