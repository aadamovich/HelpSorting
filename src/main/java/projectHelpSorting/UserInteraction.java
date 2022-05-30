package projectHelpSorting;

import java.util.Scanner;

public class UserInteraction {

    private final Scanner scanner;

    public UserInteraction() {
        scanner = new Scanner(System.in);
    }

    public double readNumber() {
        return scanner.nextInt();
    }

    public void sendMessage(String text) {
        System.out.println(text);
    }

}
