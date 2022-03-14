package homeworks;

import java.util.Scanner;

public class Homework_11_CallRockPaperScissors {

        public static void main(String[] args) {
                Homework_11_RockPaperScissors game = new Homework_11_RockPaperScissors();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Will you play game? y/n");
                String continueYN = scanner.nextLine().toLowerCase().trim();

                while (continueYN.equals("y")) {
                        System.out.println(game.gameChoose());
                }
                System.out.println("Thanks for playing with me, have a wonderful day!");
        }
}
