package Classworks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Classwork_RegularExpressions {
    public static void main(String[] args) {

/*        Scanner scanner = new Scanner(System.in);
        char again = 'y';
        while(again == 'y') {
            System.out.println("Enter your car's plate number: ");
            String plateNumber = scanner.nextLine().trim();

            // Example
            //HP - 5742
            //PO - 4356
            //uk-4646
            //PO-45
            //PI-575

            Pattern pattern = Pattern.compile("[a-zA-Z]{2}-[0-9]{2,4}");
            Matcher matcher = pattern.matcher(plateNumber);
            boolean acceptedPattern = matcher.matches();

            if (acceptedPattern) {
                System.out.println("Your inputted plate number is correct");
            } else {
                System.out.println("Your inputted plate number is not correct");
            }

            System.out.println("Do you want to check your plate number again? y / n");
            again = scanner.next().charAt(0);
            // Problem fix
            scanner.nextLine();
        }*/

        Scanner scanner = new Scanner(System.in);
        char repeat = 'y';


        while (repeat == 'y') {
            System.out.println("Please insert personal Nr: ");
            String input = scanner.nextLine().trim();

            Pattern pattern = Pattern.compile("[0-9]{6}-[0-9]{5}");
            Matcher matcher = pattern.matcher(input);
            boolean acceptedNr = matcher.matches();

            if(acceptedNr){
                System.out.println("Correct");
            } else {
                System.out.println("Incorrect");
            }

            System.out.println("Will you enter new Personal nr? y / n");
            repeat = scanner.next().charAt(0);
            scanner.nextLine();

        }
    }
}
