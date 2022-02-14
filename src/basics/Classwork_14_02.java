package basics;

import java.util.Scanner;

public class Classwork_14_02 {
    public static void main(String[] args) {

/*        Class task - Write a program that, based on the variables: height - height (int) and weight - weight (float),
        checks whether a person can ride a roller coaster.
                If a person is taller than 150cm and does not exceed 180kg,
            the program will write in the console "Fasten your seatbelt!",
                Otherwise it will write in the console "I'm sorry you can't go!".*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your height in cm: ");
        int height = scanner.nextInt();
        System.out.println("Please insert your weight in kg with one decimal number after comma: ");
        float weight = scanner.nextFloat();

        if( height >= 150 && weight <= 180.00){
            System.out.println("Fasten your seatbelt!");
        } else {
            System.out.println("I'm sorry you can't go!");
        }
// reverse version
        if( height <= 150 && weight >= 180.00){
            System.out.println("I'm sorry you can't go!");
        } else {
            System.out.println("Fasten your seatbelt!");
        }


    }
}
