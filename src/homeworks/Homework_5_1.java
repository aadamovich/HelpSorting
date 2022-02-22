package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_5_1 {
    public static void main(String[] args) {

          /*  Create a JAVA program that allows you to enter a size of an array (type int). Then ask for user to enter each element one by one.
        Ask for user to enter a positive number that will be the arrays size
        Create an empty array that will contain int data type values in size of entered value
        Using for loop ask user to enter array elements one by one
        Print out sum of all elements in the array
        */

        System.out.println("Insert positive number - array size");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int [] inputArray = new int[size];
        int sum = 0;

        System.out.println("Enter the elements one by one");

        for(int i = 0; i< size; i++){ //or ...; i <  inputArray.length; ...
          //  System.out.println("insert positive number: "); // ("gdhfg " + (i+1));
            inputArray [i]= scanner.nextInt();
            sum += inputArray[i];
        }

        // print out all elements
        System.out.println(Arrays.toString(inputArray));
        System.out.println(sum);
    }
}
