package Classworks;

import java.util.Scanner;

public class QuizArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] quizArray = new String[4][4];
        int[] answer = {3,1,2,2};
        int answerInput;
        int score = 0;

        quizArray[0][0] = "Capital city of Australia?";
        quizArray[0][1] = "Sydney";
        quizArray[0][2] = "Melbourne";
        quizArray[0][3] = "Canberra";

        quizArray[1][0] = "Capital city of USA?";
        quizArray[1][1] = "Washington";
        quizArray[1][2] = "New York";
        quizArray[1][3] = "Dallas";

        quizArray[2][0] = "Capital city of Brazil?";
        quizArray[2][1] = "Rio de Janeiro";
        quizArray[2][2] = "Brasilia";
        quizArray[2][3] = "San paulo";

        quizArray[3][0] = "Capital city of  Canada?";
        quizArray[3][1] = "Montreal";
        quizArray[3][2] = "Ottawa";
        quizArray[3][3] = "Calgary";

        for (int i = 0; i < quizArray.length; i++){

            // Question printing
            System.out.println(quizArray[i][0]);

           // Printing out answers
            for (int j = 1; j < quizArray[i].length; j++){
             System.out.println("\t" + j + ")" + quizArray[i][j]);
            }
            System.out.println("Your answer is: ");
            answerInput = scanner.nextInt();

            if (answerInput == answer[i] ){
                System.out.println("Correct");
                score++;
            } else {
                System.out.println("False");
            }
            System.out.printf("You have %d correct answers", score);



          /*  for (int j = 0; j< quizArray[i].length; j+=4 ){
                System.out.println(quizArray[i][j]);
                for (int k = 1; k < quizArray[i].length; k+=4){
                    System.out.println("     " + "1)" + quizArray[i][k]);
                    for (int l = 2; l < quizArray[i].length; l +=4){
                        System.out.println("     " + "2)" + quizArray[i][l]);
                        for (int r = 3; r < quizArray[i].length; r+=4){
                            System.out.println("     " + "3)" + quizArray[i][r]);
                        }*/


                    }
                }/*

            }
        }

    } */
}
