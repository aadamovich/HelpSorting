package Classworks;

import java.lang.module.ResolutionException;
import java.util.Scanner;

public class Classwork_16_02 {
    public static void main(String[] args) {
  /*      Lecture task 1 :
        Greatest number:
        Create a JAVA program that allows you to enter three numbers and then will output the greatest of them.
                Ask for user to enter three numbers (int type) one by one
        Determine the greatest of these numbers and print it out.
        Test example:
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87
        Expected Output :
        The greatest: 87
        7:34 */

/*
        Scanner scanner = new Scanner(System.in);
        // int firsNum, secondNum, thirdNum
        System.out.println("Enter first number:");
        int firsNum = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNum = scanner.nextInt();
        System.out.println("Enter third number:");
        int thirdNum = scanner.nextInt();*/

        // Solution 1
/*

        if(firsNum > secondNum && firsNum > thirdNum){
            System.out.println("The greatest number is first " + firsNum);
        } else if ( secondNum > firsNum && secondNum > thirdNum){
            //(secondNum > thirdNum)
            System.out.println("The greatest number is first " + secondNum);
        } else {
            System.out.println("The greatest number is third " + thirdNum);
        }
*/

        //Solution 2

      /*  if (num1 > num2) {
            if (num1 > num3){
                System.out.println("Max number: " + num1);
            } else {
                System.out.println("Max number: " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("Max number: " + num2);
            } else {
                System.out.println("Max number: " + num3);
            }
        }
        */
        // Solution 3

      /*  int max = Math.max(firsNum, secondNum);
        max = Math.max(max, thirdNum);
        System.out.println("Max value: " + max);

        // Solution 4

        System.out.println("Max value: " + Math.max(Math.max(firsNum, secondNum), thirdNum));

*/
        /*
        Lecture task 2:
        Leap year:
        Create a JAVA program that determines if year is leap or not. User should enter positive value and program
        should print out either “Leap year” or “Not a leap year”
        How to calculate if it’s a leap year:
·        it's divisible by 400, or
·        it's divisible by 4 and it's not divisible by 100.
        Example: 1600 and 1512 are leap years, but 1700 and 1514 are not.*/

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Insert a year. It should be positive number");
        int year = scanner1.nextInt();
        //if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
        if(year < 0){
            System.out.println("Incorrect input, try again");
        } else if (year % 400 == 0){
            System.out.println("It is a leap year");
        } else if (year % 4 == 0 && year % 100 != 0){
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }










    }
}
