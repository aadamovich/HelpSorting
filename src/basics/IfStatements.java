package basics;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      /*  float temperature = 38.5f;
        if(temperature > 36.8f){
            System.out.println("You have a fever!");
        } else {
            System.out.println("You are healthy!");
        } */

        System.out.println("Enter your grade");

        int grade = scanner.nextInt();
        if(grade>=4){
            System.out.println("You have passed the test");

        } if(grade<4){
            System.out.println("You have not passed the test");
        }

        if(grade<4){
            System.out.println("Very bad!");
        } else if (grade <= 5){
            System.out.println("Okey!");
        } else if (grade == 6){
            System.out.println("Nice!");
        } else {
            System.out.println("Good job!");
        }



        System.out.println("Your grade - " + grade);
/*
       // IF statements
        int a = 7;
        int b = 5;
        if (a>=b || a!=7){
            System.out.println("Hello");

        }
        if(b != a){
            System.out.println("Hello2");
        }

      */
    }
}
