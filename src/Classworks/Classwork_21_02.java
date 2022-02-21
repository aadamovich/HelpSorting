package Classworks;

import java.util.Arrays;
import java.util.Scanner;

public class Classwork_21_02 {
    public static void main(String[] args) {

      /*  Create a JAVA program that allows you to enter a size of an array (type int). Then ask for user to enter each element one by one.
        Ask for user to enter a positive number that will be the arrays size
        Create an empty array that will contain int data type values in size of entered value
        Using for loop ask user to enter array elements one by one
        Print out all array elements
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert positive number - array size");
        int size = scanner.nextInt();
        int [] inputArray = new int[size];
        int sum =0;

        System.out.println("Enter the elements one by one");

        for(int i = 0; i< inputArray.length; i++){ //or ...; i < size; ...
            System.out.println("insert positive number: "); // ("gdhfg " + (i+1));
             inputArray [i]= scanner.nextInt();
             
        }
        // print out all elements
        System.out.println(Arrays.toString(inputArray));

    }
}
