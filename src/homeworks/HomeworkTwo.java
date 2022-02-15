package homeworks;

import java.util.Scanner;

public class HomeworkTwo {
    public static void main(String[] args) {
/*

        Write a program that, based on the variable: income (double), will calculate the amount of personal income tax due and write
        it to the console.
                The tax is calculated according to the following rules:
        up to 85,528.00 tax is 18% of the base minus 556.02,
                from 85,528.00 tax is 14,839.02 + 32% of the surplus over 85,528.00.
                Get the income from the user in the console using the Scanner class.
*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your gross incomes: ");
        double income = scanner.nextDouble();
        System.out.println("Please insert incomes currency: ");
        String currency = scanner.next();
        double baseIncome = 85528.00d;
        double highIncomeTax = (((income - baseIncome) * 0.32) + 14839.02);
        double lowIncomeTax = ((income * 0.18) - 556.02);
        if (income < 556.02){
            System.out.println("Please check if income input was correct, to low incomes for calculations of tax");
        } else if (income > baseIncome){
            System.out.println("Your gross income is : " + income + " " +  currency);
            System.out.println("To your incomes will be applied tax amount: " + highIncomeTax + " " + currency );
            System.out.println("Your net incomes will be: " + (income - highIncomeTax) + " " + currency);
        } else {
            System.out.println("Your gross income is : " + income + " " + currency);
            System.out.println("To your incomes will be applied tax amount: " + lowIncomeTax + " " + currency);
            System.out.println("Your net incomes will be: " + (income - lowIncomeTax + " " +  currency));

        }



    }
}
