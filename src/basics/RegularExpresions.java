package basics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpresions {
    public static void main(String[] args) {


        // Example 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert something");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("a+b*");
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.matches());

    /*    Pattern pattern = Pattern.compile("p{5}[0-9]{2,4}");
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.matches());*/

    }
}
