package advanced1.carpet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter floor length");
        double length = scanner.nextDouble();

        System.out.println("Please enter floor width");
        double width = scanner.nextDouble();
        // Floor object
        Floor floor1 = new Floor(width, length);

        System.out.println("Please enter carpet price");
        double price = scanner.nextDouble();

        // Carpet object
        Carpet carpet1 = new Carpet(price);

        Calculator calculator = new Calculator(floor1, carpet1);
        System.out.println("That will cost you: " + calculator.getTotalCost());
    }
}
