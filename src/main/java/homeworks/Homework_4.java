package homeworks;

import java.util.Scanner;

public class Homework_4 {
    public static void main(String[] args) {

   /*       Scanner scanner = new Scanner(System.in);
        System.out.println("Insert positive number:");
        int height = scanner.nextInt();
       int root = 1;


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
*/
        // Second solution
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter trees size");

        int size = scanner.nextInt();

        for (int i = 0; i < size; i++){
            //Spaces
            for(int j = 0; j < size - 1 - i; j++){
                System.out.print(" ");
            }
            //* symbol
            for (int j = 0; j < 2 * i + 1 ; j++){
                System.out.print("*");
            }
            //Going to next line
            System.out.println();
        }

        //Base of the tree
        for (int i = 0; i < size -1; i++){
            System.out.print(" ");
        }
        System.out.println("#");
    }
}
