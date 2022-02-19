package homeworks;

import java.util.Scanner;

public class HomeworkFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert positive number:");
        int height = scanner.nextInt();
       int root = 1;
       int space = root - 1;

        for (int i = 0; i < height; i++) {
            for (int j = height - 1; j > i; j--)
                System.out.print(' ');
            for (int k = i * 2; k >= 0; k--)
                System.out.print('*');
            System.out.println();

        }
        for (int i = 1; i <= root; i++) {
            for (int j = height; j > i; j--) {
                System.out.print(" ");
           }
            System.out.print("#\n");


        }

    }
}
