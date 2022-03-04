package basics;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class StringExample2 {
    public static void main(String[] args) {

        String text = "this is text example. No war?";
        System.out.println(text.charAt(0));

        // Access char at specific index
        System.out.println(text.charAt(1));

// Length of char elements in string
        System.out.println(text.length());

// get last char from String
        System.out.println(text.charAt(text.length()-1));

        //Check if last char of string is . or ! or ?
        char lastChar = text.charAt(text.length()-1);
        if (lastChar == '.' || lastChar == '!' || lastChar == '?'){
            System.out.println("OK");
        } else {
            System.out.println("Grammar error");
        }

        // Substrings (get text from written index till the end)
        System.out.println(text.substring(10));
        // Substring (get text from written index till second index)
        System.out.println(text.substring(10, 15));
        System.out.println(text.substring(text.length()-5));

        // Formating

        String name = "Bob";
        int age = 45;
        float height = 181.567f;

        System.out.println("My name is " + name + "I'm " + age + "years old.\n "
                + "And my height is " + height + "cm");

        System.out.printf("My name is %s I'm %d years old. \n And my height is %.0f cm\n", name,age,height);

        // Replacement
        String inputText = "Hahahahaha, shit that was a fanny joke, shit, shit!";
        System.out.println(inputText.replaceAll("shit", "s***"));
        System.out.println(inputText.replaceFirst("shit", "s***"));

        // Converting string to primitive data type

        String intStrValue = "6";
        String floatStrValue = "2.0";
        String doubleStrValue = "2.3434343434";
        String booleanStrValue = "true";
        String longStrValue = "100000000000000";

        int intValue = Integer.parseInt(intStrValue);
        System.out.println(intValue * 2);
        float floatValue = Float.parseFloat(floatStrValue);
        System.out.println(floatValue * 5);
        double doubleValue = Double.parseDouble(doubleStrValue);
        System.out.println(doubleValue * 100);
        boolean booleanValue = Boolean.parseBoolean(booleanStrValue);
        System.out.println(booleanValue);
        long longValue = Long.parseLong(longStrValue);
        System.out.println(longStrValue);

        // Class task
        // Determine of I can buy alcohol if age must be at the end of sentence
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");

        String input = scanner.nextLine();

        System.out.println(input);
        String age1 = input.substring(input.length()-2);
        int ageNum = Integer.parseInt(age1);

        if( ageNum>=18){
            System.out.println("You are over 18");
        } else {
            System.out.println("you are to young");
       }


    }
}
