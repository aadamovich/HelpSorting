package basics;

import java.util.Locale;
import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {

        String text1 = "This is ";
        String text2 = "text two";
        String finalText = text1 + text2 + "!";

      //  text1 += text2;

        System.out.println(text1);
        System.out.println(text1 + text2);
        System.out.println(text2);
        System.out.println(finalText);

        // Example 2

        String firstName = "Monta ";
        String lastName = "Kalva";
        System.out.println(firstName.concat(lastName).concat("!"));

        //Example 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine().toLowerCase().trim();

       // System.out.println(name.toLowerCase());
       // System.out.println(name.toUpperCase());

        if (name.equals("janis")){
            System.out.println("Yes you are Jānis");
        } else {
            System.out.println("Go home!");
        }

        //Example 4

        String trimExample = "   Monta Kalva    ";
        System.out.println(trimExample.trim());


    }
}
