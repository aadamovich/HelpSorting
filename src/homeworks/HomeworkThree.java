package homeworks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HomeworkThree {
    public static void main(String[] args) {

/*        Write a program which, based on the variables: amount - amount (double) and number of installments - numberOfInstallments (int),
 will calculate the monthly loan installment and write it to the console. The parameters have restrictions:
        the loan amount must be between 100.00 and 10,000.00,
                the number of installments must be between 6 and 48.
        If the loan amount exceeds the acceptable range, the loan amount should be set at 5,000.00.
         If the number of installments exceeds the acceptable range, the number of installments should be set to 36.
        The calculated monthly installment should also include interest.
         To simplify the calculations, assume that you add X percent to the loan amount depending on the number of installments:
        6-12 installments - 2.5%,
                13-24 installments - 5.0%,
                25-48 installments - 10.0%,
                and then calculate the installment amount based on the number of installments.
                Get the data from the user in the console using the Scanner class.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert necessary amount of loan from 100 EUR to 10 000 EUR: ");
        double amount = scanner.nextDouble();

        System.out.println("Insert necessary number of installments at range from 6 to 48: ");
        int numberOfInstallments = scanner.nextInt();

        if (amount > 10000.00 || amount < 100.00){
            amount = 5000.00d;
            System.out.println("Inserted amount was not correct, we set it to " + amount);
        }

        if (numberOfInstallments > 48 || numberOfInstallments < 6){
            numberOfInstallments = 36;
            System.out.println("Inserted number of installments was not correct, we set it to " + numberOfInstallments);

        }
        double monthInterest;
        double startIndexLoan = (amount / numberOfInstallments);
        double monthInstallments;
        DecimalFormat df = new DecimalFormat("0.00");


        if (numberOfInstallments >= 6 && numberOfInstallments <= 12) {
            //if(numberOfInstallments <= 12){
            monthInterest = startIndexLoan * 0.025d;
            monthInstallments = startIndexLoan + monthInterest;

            System.out.printf("Your monthly Installment will be: %.2f \n", monthInstallments);
            System.out.printf("Your monthly interest will be: %.2f \n", monthInterest );
            System.out.printf("Your loan total cost will be: %.2f \n", (monthInstallments*numberOfInstallments));

        } else if (numberOfInstallments >= 13 && numberOfInstallments <= 24){
            // else if (numberOfInstalments <=24){
            monthInterest = startIndexLoan * 0.050d;
            monthInstallments = startIndexLoan + monthInterest;

            System.out.println("Your monthly Installment will be: " + Math.round(monthInstallments * 100.0) / 100.0);
            System.out.println("Your monthly Installment will be: " + Math.round(monthInterest * 100.0 )/100.0);
            System.out.println("Your loan total cost will be: " + (monthInstallments*numberOfInstallments));
        } else {
            monthInterest = startIndexLoan * 0.10d;
            monthInstallments = startIndexLoan + monthInterest;

            System.out.println("Your monthly Installment will be: " + df.format(monthInstallments));
            System.out.println("Your monthly Installment will be: " + df.format(monthInterest));
            System.out.println("Your loan total cost will be: " + df.format((monthInstallments * numberOfInstallments)));
        }

    }
}
/*
 Second solution

Scanner scanner = new Scanner(System.in);

        System.out.println("Enter loan amount");
        double amount = scanner.nextDouble();

        System.out.println("Enter number of installments");
        int numberOfInstallments = scanner.nextInt();

        if(amount < 100.0 || amount > 10000.0){
            amount = 5000;
        }

        if(numberOfInstallments < 6 || numberOfInstallments > 48){
            numberOfInstallments = 36;
        }

        double loanInterest;

        if(numberOfInstallments <= 12){
            loanInterest = 1.025;
        } else if(numberOfInstallments <= 24){
            loanInterest = 1.05;
        } else {
            loanInterest = 1.1;
        }

        System.out.println("Each month you will have to pay: " +  amount * loanInterest / numberOfInstallments); */
