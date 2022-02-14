package homeworks;

import java.util.Scanner;

public class HomeworkOne {
    public static void main(String[] args) {
/*
        *//*1.Write a program that reads a temperature in degrees Fahrenheit and prints out the corresponding temperature in degrees Celsius (C = (F - 32) * 5 / 9).
Make the program 'user friendly' *//*

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert temperature in degrees Fahrenheit: ");

        //  double tempInserted = scanner.nextDouble();
        //  double tempCelsius = (tempInserted - 32) * 5 / 9;
        double tempCelsius = (scanner.nextDouble() - 32) * 5 / 9;

        System.out.println("Temperature in degrees Celsius: " + tempCelsius);

        //2. Write a program that reads the length and breadth of a rectangle in cm and computes its area.

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Insert length of a rectangle in cm: ");
        double length = scanner1.nextDouble();
        System.out.println("Insert breadth of a rectangle in cm: ");
        double breadth = scanner1.nextDouble();
        double rectangleArea = length * breadth;
        System.out.println("Rectangle area is " + rectangleArea);

        *//*        3.Write an application, that will read one floating-point number (of type `float`) and will print:
         * it's value rounded down to closest integer,
         * it's value rounded according to rules of math,
         * it's value is rounded up to the closest integer.*//*

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Insert a number with two digits after the decimal point: ");

        float number = scanner2.nextFloat();
        System.out.println("it's value rounded down to closest integer - " + Math.floor(number));
        System.out.println("it's value rounded according to rules of math - " + Math.ceil(number));
        System.out.println("it's value is rounded up to the closest integer - " + Math.round(number));*/

/*        4. Create a JAVA program that allows you to enter a maximum random number for program to generate. Generate a random number from 0 to entered max number. And then using while loop ask user to guess the number. Allow user to guess as long as they enter the same number that was generated.
        Ask for user to enter a positive number
        Generate random number in range 0 – entered number
        Ask user to guess the number, allow to guess as long as they enter they enter generated number
        Congratulate user for guess the number*/

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Please insert positive number: ");
        int maxNumber = scanner3.nextInt();
        int minNumber = 0;
        System.out.println("How many tries?");
        int guessCount = scanner3.nextInt();

        int randomNum = ((int) ((Math.random() * maxNumber) + 1) - 1);
        //int randomNum = (int) (Math.random() * (max + 1));
        System.out.println("Try to guess random number. It will be between " + minNumber + " and " + maxNumber);

        System.out.println("Enter your guess: ");
        int guessNum = scanner3.nextInt();
        guessCount --;

        while (randomNum != guessNum && guessCount > 0) {
            System.out.println("You have left " + guessCount + " tries");
            if (randomNum != guessNum) {
/*               System.out.println("Your guess was " + guessNum + ". It wasn't correct answer. Try again!");
           }
           System.out.println("Enter your guess: ");*/

                if (guessNum < randomNum) {
                    System.out.println("Try bigger");
                } else {
                    System.out.println("Try smaller");
                }
                guessNum = scanner3.nextInt();
                guessCount--;
            }
        }
            if( guessNum == randomNum){
                System.out.println("Congratulations! Your guess was correct. Correct answer was " + randomNum);
            } else {
                System.out.println("Sorry you lost");
                System.out.println("Correct number was " + randomNum);
            }
    }
}

