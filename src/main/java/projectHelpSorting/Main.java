package projectHelpSorting;

import java.util.Scanner;

import static projectHelpSorting.Account.createAccount;
import static projectHelpSorting.Account.logIn;
import static projectHelpSorting.SortingMethodsList.*;

public class Main {
    public static void main(String[] args) throws Exception {


        System.out.println("Welcome to \"Help Sorting\". ");

        System.out.println("Would you like to continue with authorization (Press 1) or as a guest (Press 2)");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        int quite = 0;

        if (choice == 1) {

            System.out.println("Create Account (Press 1) or Log in (Press 2)");
            int accountChoice = scanner.nextInt();
            if (accountChoice == 1) {
                createAccount();
            } else if (accountChoice == 2) {
                logIn(); // check in database, if not correct try again
            } else {
                System.out.println("Some problem with authorization, please try again!");
            }

            while (quite != 2) {
                System.out.println("Please press 1 if you need help, press 2 if you would like to provide help: ");

                int select = scanner.nextInt();

                if (select == 1) {
                    System.out.println("Please select necessary help: \n\t" +
                            "1 - Arrival to Latvia\n\t" +
                            "2 - Long term stay\n\t" +
                            "3 - Social support\n\t" +
                            "4 - Help center locations\n\t" +
                            "5 - Health care \n\t" +
                            "6 - Psychological support\n\t" +
                            "7 - Other type of support\n\t" +
                            "8 - Thank you, nothing more\n"); // method additional smile

                    int helpChoice = scanner.nextInt();

                    switch (helpChoice) {
                        case 1:
                            arrivalToLatvia();
                            break;
                        case 2:
                            longTermStay();
                            break;
                        case 3:
                            readSocialSupport();
                            break;
                        case 4:
                            readHelpCenters();
                            break;
                        case 5:
                            readHealthHelp();
                            break;
                        case 6:
                            System.out.println("Psychological support");
                            break;
                        case 7:
                            System.out.println("Other type of support");
                            break;
                        default:
                            System.out.println("Something went wrong, please try again or contact support center: xxxxxx@xx.lv");
                    }

                } else if (select == 2) {

                    System.out.println("Please select type of help you would like to provide: \n\t" +
                            "1 - Donate money \n\t" +
                            "2 - Donate goods \n\t" +
                            "3 - Transportation \n\t" +
                            "4 - Accommodation \n\t" +
                            "5 - Job Offers \n\t" +
                            "6 - Health care \n\t" +
                            "7 - Social support \n\t" +
                            "8 - Volunteering work \n\t" +
                            "9 - Thank you, nothing more\n"); // if choose any other method than donate money, offer easy and fat donation

                    int supportChoice = scanner.nextInt();

                    switch (supportChoice) {
                        case 1:
                            donateMoney();
                            break;
                        case 2:
                            donateGoods();
                            break;
                        case 3:
                            transportation();
                            break;
                        case 4:
                            accommodation();
                            break;
                        case 5:
                            jobOffer();
                            break;
                        case 6:
                            healthCare();
                            break;
                        case 7:
                            socialSupport();
                            break;
                        case 8:
                            volunteeringWork();
                            break;
                        default:
                            System.out.println("Something went wrong, please try again or contact support center: xxxxxx@xx.lv");
                    }
                    System.out.println();

                } else {
                    System.out.println("Something went wrong, try again!");
                }
                System.out.println("Would you like to continue? Press 1 to continue; Press 2 to quite");
                quite = scanner.nextInt();
            }


        } else if (choice == 2) {
            System.out.println(); // without login
        } else {
            System.out.println("Something went wrong, try again!");
        }
    }
}
