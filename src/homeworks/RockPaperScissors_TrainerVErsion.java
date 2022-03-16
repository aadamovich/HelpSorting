package homeworks;

public class RockPaperScissors_TrainerVErsion {

    // 1. Solution
/*    import java.util.Scanner;

    public class RPS {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            char play = 'y';

            while (play == 'y'){

                System.out.println("Please enter Player's 1 choice");
                String player1 = scanner.nextLine().toLowerCase().trim();

                System.out.println("Please enter Player's 2 choice");
                String player2 = scanner.nextLine().toLowerCase().trim();

                System.out.println(rockPaperScissors(player1,player2));

                System.out.println("Do you want to play again?");
                play = scanner.next().charAt(0);
                scanner.nextLine();

            }

        }

        public static String rockPaperScissors(String player1, String player2){
            String answer;

            if(!checkInputIsValid(player1,player2)){
                answer = "Input is not valid";
                return answer;
            }
            if((player1.equals("paper") && player2.equals("rock"))
                    || (player1.equals("scissors") && player2.equals("paper"))
                    || (player1.equals("rock") && player2.equals("scissors"))
            ){
                answer = "Player 1 wins!";
            } else  if(player1.equals(player2)){
                answer = "I's a tie!";
            }else {
                answer = "Player 2 wins!";
            }
            return answer;

        }

        public static boolean checkInputIsValid(String player1, String player2){

            return player1.matches("rock|scissors|paper") && player2.matches("rock|scissors|paper");

        }



    }*/

    // 2. Solution
/*    import java.util.Scanner;

    public class RPS {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            char play = 'y';

            while (play == 'y'){


                System.out.println("Please enter Player's 1 choice");
                String player1 = scanner.nextLine().toLowerCase().trim();

                System.out.println("Please enter Player's 2 choice");
                String player2 = scanner.nextLine().toLowerCase().trim();

                System.out.println("Version? 1/2");
                int version = scanner.nextInt();
                //scanner.nextLine();


                if(version == 1){
                    System.out.println(rockPaperScissors(player1,player2));
                }else {
                    System.out.println(rockPaperScissorsLizardSpock(player1,player2));
                }


                System.out.println("Do you want to play again?");
                play = scanner.next().charAt(0);
                scanner.nextLine();

            }

        }

        public static String rockPaperScissors(String player1, String player2){
            String answer;

            if(!checkInputIsValid(1,player1,player2)){
                answer = "Input is not valid";
                return answer;
            }
            if((player1.equals("paper") && player2.equals("rock"))
                    || (player1.equals("scissors") && player2.equals("paper"))
                    || (player1.equals("rock") && player2.equals("scissors"))
            ){
                answer = "Player 1 wins!";
            } else  if(player1.equals(player2)){
                answer = "I's a tie!";
            }else {
                answer = "Player 2 wins!";
            }
            return answer;

        }

        public static String rockPaperScissorsLizardSpock(String player1, String player2){

            String answer;

            if(!checkInputIsValid(2,player1,player2)){
                return answer = "Input is not valid";
            }

            if (
                    (player1.equals("rock") && (player2.equals("lizard") || player2.equals("scissors")))
                            ||(player1.equals("paper") && (player2.equals("rock") || player2.equals("spock")))
                            ||(player1.equals("scissors") && (player2.equals("paper") || player2.equals("lizard")))
                            ||(player1.equals("lizard") && (player2.equals("paper") || player2.equals("spock")))
                            ||(player1.equals("spock") && (player2.equals("rock") || player2.equals("scissors")))
            ){
                answer = "Player 1 wins";
            } else if (player1.equals(player2)){
                answer = "I's a tie!";
            } else {
                answer = "Player 2 wins";
            }
            return answer;

        }





        public static boolean checkInputIsValid(int version, String player1, String player2){

            if(version == 1){
                return player1.matches("rock|scissors|paper") && player2.matches("rock|scissors|paper");
            }else {
                return player1.matches("rock|scissors|paper|spock|lizard") && player2.matches("rock|scissors|paper|spock|lizard");
            }

        }



    }*/

    // 3rd Solution

/*
    import java.util.Scanner;

    public class RPS {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] possibleAnswers = {"rock","paper","scissors"};

            char play = 'y';

            while (play == 'y'){


                System.out.println("Please enter Player's 1 choice");
                String player1 = scanner.nextLine().toLowerCase().trim();

*/
/*            System.out.println("Please enter Player's 2 choice");
            String player2 = scanner.nextLine().toLowerCase().trim();*//*


                int rand = (int) (Math.random() * (possibleAnswers.length));
                String player2 = possibleAnswers[rand];
                System.out.println("Computer : " + player2);

                System.out.println("Version? 1/2");
                int version = scanner.nextInt();
                //scanner.nextLine();


                if(version == 1){
                    System.out.println(rockPaperScissors(player1,player2));
                }else {
                    System.out.println(rockPaperScissorsLizardSpock(player1,player2));
                }


                System.out.println("Do you want to play again?");
                play = scanner.next().charAt(0);
                scanner.nextLine();

            }

        }

        public static String rockPaperScissors(String player1, String player2){
            String answer;

            if(!checkInputIsValid(1,player1,player2)){
                answer = "Input is not valid";
                return answer;
            }
            if((player1.equals("paper") && player2.equals("rock"))
                    || (player1.equals("scissors") && player2.equals("paper"))
                    || (player1.equals("rock") && player2.equals("scissors"))
            ){
                answer = "Player 1 wins!";
            } else  if(player1.equals(player2)){
                answer = "I's a tie!";
            }else {
                answer = "Player 2 wins!";
            }
            return answer;

        }

        public static String rockPaperScissorsLizardSpock(String player1, String player2){

            String answer;

            if(!checkInputIsValid(2,player1,player2)){
                return answer = "Input is not valid";
            }

            if (
                    (player1.equals("rock") && (player2.equals("lizard") || player2.equals("scissors")))
                            ||(player1.equals("paper") && (player2.equals("rock") || player2.equals("spock")))
                            ||(player1.equals("scissors") && (player2.equals("paper") || player2.equals("lizard")))
                            ||(player1.equals("lizard") && (player2.equals("paper") || player2.equals("spock")))
                            ||(player1.equals("spock") && (player2.equals("rock") || player2.equals("scissors")))
            ){
                answer = "Player 1 wins";
            } else if (player1.equals(player2)){
                answer = "I's a tie!";
            } else {
                answer = "Player 2 wins";
            }
            return answer;

        }





        public static boolean checkInputIsValid(int version, String player1, String player2){

            if(version == 1){
                return player1.matches("rock|scissors|paper") && player2.matches("rock|scissors|paper");
            }else {
                return player1.matches("rock|scissors|paper|spock|lizard") && player2.matches("rock|scissors|paper|spock|lizard");
            }

        }



    }
*/

}
