package basics;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter score");
        float score = scanner.nextFloat();

        if(score <= 40.0f){
            System.out.println(name + "score: <= 40%");
        } else if(score > 40.0f && score<=80.0f){
            System.out.println(name + "score: <= 80%");
            if(score <= 70.0f){
                System.out.println("<70");
            } else {
                System.out.println(">70");
            }
        } else {
            System.out.println(name + "score: <=100%");

            if((int) score % 2 == 0){
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }


    }
}
