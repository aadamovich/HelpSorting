package basics;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        int[] grades = new int[5];
        grades[0] = 10;
        grades[1] = 8;
        grades[2] = 9;
        grades[3] = 6;
        grades[4] = 7;

        System.out.println(grades[0] + " " + grades[1]);

        // Length of array
        System.out.println(grades.length);

        for(int i = 0; i < grades.length; i++){
            System.out.println(grades[i]);
            // System.out.print(grades[i] + " ");
        }

        // Example 2

        double[] weather = new double[]{24.6d, 25.7d, 23.4d};
        System.out.println(weather[2]);

        // Example 3

        String[] names = new String[4];
        System.out.println(names[0]);
        names[0] = "Monta";
        System.out.println(names[0]);

        names[0] = "kool";
        System.out.println(names[0]);

        System.out.println();

        names[2] = "Lisa";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);


        System.out.println(Arrays.toString(names));

  // For each

        for(String name: names){
            System.out.println(name);
        }


    }
}
