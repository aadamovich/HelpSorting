package homeworks;

import java.util.Locale;
import java.util.Scanner;

public class Homework_8_Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input text: ");
        String input = scanner.nextLine().toLowerCase().trim();

        String reverseInput = "";
        int inputLength = input.length();
        for (int i = (inputLength - 1); i >= 0; i--) {
            reverseInput = reverseInput + input.charAt(i);
        }
        if (input.equals(reverseInput)) {
            System.out.println(input + " is a palindrome  ");

        } else {
            System.out.println(input + " is not a palindrome  ");
        }

/*      for (int i = 0; i < input.length()/2; i++) {   // 2.nd solution
            char start = input.charAt(i);
            char last = input.charAt(input.length() - 1 - i);

            if (start != last) {
                System.out.printf("%s is not palindrome\n", input);
                break;
            }
         System.out.printf("%s is palindrome\n", input);
        }*/

/*        Scanner scanner = new Scanner(System.in);                        // 3rd solution
        String input = scanner.nextLine().toLowerCase().trim();
        boolean isPalindrome = true;

        for (int i = 0; i<input.length() / 2; i++){
            if(input.charAt(i) != input.charAt(input.length() - 1 - i)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("Your input " + input + " is a palindrome");
            System.out.printf("Your input %s is a palindrome",input);
        }else {
            System.out.printf("Your input %s is not a palindrome",input);
        }*/
    }
}


