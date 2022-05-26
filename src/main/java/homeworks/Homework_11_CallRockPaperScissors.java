package homeworks;

import java.util.Scanner;

public class Homework_11_CallRockPaperScissors {

        public static void main(String[] args) {
                Homework_11_RockPaperScissors game = new Homework_11_RockPaperScissors();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Will you play game? y/n");
// Check                System.out.println("CallMethod");
                String continueYN = scanner.nextLine().toLowerCase().trim();

                if (continueYN.equals("y")) {
                        System.out.println(game.gameChoose());

                } else {
                        System.out.println("Thanks for playing with me, have a wonderful day!");
                }
        }
}
