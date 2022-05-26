package homeworks;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Homework_5_2 {
    public static void main(String[] args) {

        System.out.println("Enter the required size of the array (positive integer): ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        float[] inputArray = new float[size];
        float sum = 0;
        if (size <= 0) {
            System.out.println("Invalid input, please insert positive number starting from 1");
        } else {

            System.out.println("Enter the elements one by one");

            for (int i = 0; i < size; i++) { //or ...; i <  inputArray.length; ...
                System.out.println("insert grade: "); // ("gdhfg " + (i+1));
                inputArray[i] = scanner.nextFloat();
                sum += inputArray[i];
            }
            float aver = sum/size;
            DecimalFormat df = new DecimalFormat("0.00");


            // print out all elements
            //    System.out.println(Arrays.toString(inputArray));
            System.out.println("Average grade is: " + df.format(aver));
            System.out.printf("You inserted %d grades", size);
        }
    }
}


