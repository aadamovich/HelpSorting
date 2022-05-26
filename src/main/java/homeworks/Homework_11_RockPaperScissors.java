package homeworks;

import java.util.Random;
import java.util.Scanner;

public class Homework_11_RockPaperScissors {
    public String rockPaperScissors() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Will you play game? y/n");
 //Check       System.out.println("Method0");
        String continueYN = scanner.nextLine().toLowerCase().trim();
        while (continueYN.equals("y")){
        if (continueYN == "n"){
            break;
        }
            System.out.println("Player one input: rock / paper /  scissors");
            String inputPayer1 = scanner.nextLine().toLowerCase().trim();
            Random random = new Random();
            int randomInput = random.nextInt(3);

            String computerMove;
            if (randomInput == 0) {
                computerMove = "rock";
            } else if (randomInput == 1) {
                computerMove = "paper";
            } else {
                computerMove = "scissors";
            }
            System.out.println("Player two chose " + computerMove + "!");
               /* String[] myArray = {"rock", "paper", "scissors"};
                Random random = new Random();
                int randomInput = random.nextInt(myArray.length);
             System.out.println("Player two input rock / paper / scissors:  ");
             String inputPayer2 = scanner.nextLine().toLowerCase().trim();
             String toCompare = inputPayer1 + inputPlayer2;*/
            String toCompare = inputPayer1 + randomInput;

            switch (toCompare) {
                case "paper0":
                    System.out.println("Player one wins!");
                    break;
                case "rock2":
                    System.out.println("Player one wins!");
                    break;
                case "scissors1":
                    System.out.println("Player one wins!");
                    break;
                case "paper2":
                    System.out.println("Player two wins!");
                    break;
                case "rock1":
                    System.out.println("Player two wins!");
                    break;
                case "scissors0":
                    System.out.println("Player two wins!");
                    break;
                case "rock0":
                    System.out.println("TIE!");
                    break;
                case "paper1":
                    System.out.println("TIE!");
                    break;
                case "scissors2":
                    System.out.println("TIE!");
                    break;
                default:
                    System.out.println("Incorrect input, try again");

            }
            System.out.println("Will you play game? y/n");
// Check            System.out.println("Method1");
            String continue1YN = scanner.nextLine().toLowerCase().trim();
            if (continue1YN.equals("n")) {
                System.out.println("Thanks for playing with me, have a wonderful day!");
// Check                System.out.println("Method2");
                break;
            }
      }
        return " ";
    }


    public String rockPaperScissorsLizardSpock() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Will you play game? y/n");
// Check        System.out.println("Lizard0");
        String continueYN = scanner.nextLine().toLowerCase().trim();
        while (continueYN.equals("y")) {
            if (continueYN == "n") {
                break;
            }
            System.out.println("Player one input: rock / paper /  scissors / lizard / spock");
            String inputPayer1 = scanner.nextLine().toLowerCase().trim();
            Random random = new Random();
            int randomInput = random.nextInt(5);

            String computerMove;
            if (randomInput == 0) {
                computerMove = "rock";
            } else if (randomInput == 1) {
                computerMove = "paper";
            } else if (randomInput == 2) {
                computerMove = "scissors";
            } else if (randomInput == 3) {
                computerMove = "lizard";
            } else {
                computerMove = "spock";
            }
            System.out.println("Player two chose " + computerMove + "!");
               /* String[] myArray = {"rock", "paper", "scissors"};
                Random random = new Random();
                int randomInput = random.nextInt(myArray.length);
            System.out.println("Player two input rock / paper / scissors:  ");
            String inputPayer2 = scanner.nextLine().toLowerCase().trim();
            String toCompare = inputPayer1 + inputPlayer2; */

            String toCompare = inputPayer1 + randomInput;

            switch (toCompare) {
                case "paper0":
                    System.out.println("Player one wins!");
                    break;
                case "rock2":
                    System.out.println("Player one wins!");
                    break;
                case "scissors1":
                    System.out.println("Player one wins!");
                    break;
                case "rock3":
                    System.out.println("Player one wins!");
                    break;
                case "paper4":
                    System.out.println("Player one wins!");
                    break;
                case "scissors3":
                    System.out.println("Player one wins!");
                    break;
                case "lizard1":
                    System.out.println("Player one wins!");
                    break;
                case "lizard4":
                    System.out.println("Player one wins");
                    break;
                case "spock0":
                    System.out.println("Player one wins");
                    break;
                case "spock2":
                    System.out.println("Player one wins");
                    break;
                case "paper2":
                    System.out.println("Player two wins!");
                    break;
                case "paper3":
                    System.out.println("Player two wins!");
                    break;
                case "rock1":
                    System.out.println("Player two wins!");
                    break;
                case "rock4":
                    System.out.println("Player two wins!");
                    break;
                case "scissors0":
                    System.out.println("Player two wins!");
                    break;
                case "scissors4":
                    System.out.println("Player two wins!");
                    break;
                case "lizard0":
                    System.out.println("Player two wins!");
                    break;
                case "lizard2":
                    System.out.println("Player two wins!");
                    break;
                case "spock1":
                    System.out.println("Player two wins!");
                    break;
                case "spock3":
                    System.out.println("Player two wins!");
                    break;
                case "rock0":
                    System.out.println("TIE!");
                    break;
                case "paper1":
                    System.out.println("TIE!");
                    break;
                case "scissors2":
                    System.out.println("TIE!");
                    break;
                case "lizard3":
                    System.out.println("TIE!");
                    break;
                case "spock4":
                    System.out.println("TIE!");
                    break;
                default:
                    System.out.println("Incorrect input, try again");
            }

            System.out.println("Will you play game? y/n");
// Check            System.out.println("Lizard1");
            String continue1YN = scanner.nextLine().toLowerCase().trim();
            if (continue1YN.equals("n")) {
                System.out.println("Thanks for playing with me, have a wonderful day!");
// Check                System.out.println("Lizard3");
                break;
            }
        }
        return " ";
    }

    public String gameChoose() {
        System.out.println("I will play: Rock Paper Scissors - insert 1; Rock Paper Scissors, Lizard, Spock - insert 2");
        Scanner scanner = new Scanner(System.in);
        int gameChoose = scanner.nextInt();
        if (gameChoose == 1) {
            return rockPaperScissors();
        } else if (gameChoose == 2) {
            return rockPaperScissorsLizardSpock();
        }
        return gameChoose();
    }
}
