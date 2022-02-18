package Classworks;

import java.util.Scanner;

public class Classwork_18_02 {
    public static void main(String[] args) {
/*        Write an application, that will read a number (of type int) and will write in one line all numbers
 starting from given number to 0 (included). Keep in mind that given number may be equal to 0 or be negative.
 Use scanner to read input from user.
                Examples:
        for given number: 5, application should write: 5 4 3 2 1 0
        for given number: 0, application should write: 0
        for given number: -4, application should write: -4 -3 -2 -1 0*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert integer number");
        int number = scanner.nextInt();

        if (number >= 0) {

            for (int i = number; i > -1; i--) {
                System.out.print(i + " ");
                number--;

                // for(int i = number; i >= 0; i--){
                // System.out.print(i + " ");
                // }
            }
        } else {
            for (int i = number; i < 1; i++) {  // i +=2 - increasing by two

                // for(int i = number; i <= 0; i++){
                // System.out.print(i + " ");
                // }
                System.out.print(i + " ");
                number++;
            }


        }
        System.out.println();

        for(int i = 0; i<= 10; i++){
            for (int j = 1; j <= 10; j++){
               // System.out.print(i + "*" + j + "+" + i*j + " ");
                System.out.printf("%d * %d = %d ", i, j, i*j);
            }
            System.out.println();
        }
    }
}
