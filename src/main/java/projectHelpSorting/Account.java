package projectHelpSorting;

import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
   public static int currentUserId = 0;

    public static void createAccount() {
        Scanner scanner = new Scanner(System.in);
        UserInfo createAccount = new UserInfo();

        System.out.println("Create your username");

        createAccount.setUsername(scanner.nextLine());
        int userId = DataBase.checkUserName(createAccount.getUsername());
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9#?!@$%^&*+-_=]{6,20}$");
        Matcher matcher;
        matcher = pattern.matcher(createAccount.getUsername());
        while (!matcher.matches()) {
            System.out.println("Please insert valid username. It must be at least 6 characters long ");
            createAccount.setUsername(scanner.nextLine());
            matcher = pattern.matcher(createAccount.getUsername());
        }

        while (userId > 0) {
            System.out.println("Username already exists! Try another one!");
            createAccount.setUsername(scanner.nextLine());
            pattern = Pattern.compile("^[a-zA-Z0-9#?!@$%^&*+-_=]{6,20}$");
            matcher = pattern.matcher(createAccount.getUsername());
            while (matcher.matches() == false) {

                System.out.println("Please insert valid username. It must be at least 6 characters long ");
                createAccount.setUsername(scanner.nextLine());
                pattern = Pattern.compile("^[a-zA-Z0-9#?!@$%^&*+-_=]{6,20}$");
                matcher = pattern.matcher(createAccount.getUsername());
            }
        }

            System.out.println("Username successfully created!");
        // create additional check is similar username in database

        System.out.println("Create your password: It must contain at least 6 characters with at least 1 number, 1 symbol");// To check password
        createAccount.setPassword(scanner.nextLine());
        pattern = Pattern.compile("^(?=.*?[0-9])(?=.*?[#?!@$%^&*+-=]).{6,}$");
        matcher = pattern.matcher(createAccount.getPassword());
        while (!matcher.matches()) {
            System.out.println("Please insert valid password. It must contain at least 6 characters with at least 1 number, 1 symbol");
            createAccount.setPassword(scanner.nextLine());
            matcher = pattern.matcher(createAccount.getPassword());
        }
        System.out.println("Password created successfully!");

        System.out.println("Please insert your Name Surname");
        createAccount.setName(scanner.nextLine());
        pattern = Pattern.compile("^([a-zA-Z]{2,}\\s[a-zA-Z]{2,}'?-?[a-zA-Z]{2,}\\s?([a-zA-Z]{2,})?)");
        matcher = pattern.matcher(createAccount.getName());
        while (!matcher.matches()) {
            System.out.println("Please insert valid Name Surname");
            createAccount.setName(scanner.nextLine());
            matcher = pattern.matcher(createAccount.getPassword());
        }

        System.out.println("E-mail");
        createAccount.seteMail(scanner.nextLine());
        pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        matcher = pattern.matcher(createAccount.geteMail());
        while (!matcher.matches()) {
            System.out.println("Please insert valid e-mail");
            createAccount.seteMail(scanner.nextLine());
            matcher = pattern.matcher(createAccount.geteMail());
        }

        System.out.println("Phone number: Example XXX-XXXXXXXX");
        createAccount.setPhone(scanner.nextLine());
        pattern = Pattern.compile("[0-9]{3}[-][0-9]{6,}");
        matcher = pattern.matcher(createAccount.getPhone());
        while (!matcher.matches()) {
            System.out.println("Please insert valid phone number");
            createAccount.setPhone(scanner.nextLine());
            matcher = pattern.matcher(createAccount.getPhone());
        }

        System.out.println("What languages you know at level of speaking or understanding"); // could be box where you can select language and level
        Set<String> langList = Set.of("LATVIAN", "ENGLISH", "RUSSIAN", "GERMAN", "ITALIAN", "SPANISH", "LITHUANIAN",
                                      "UKRAINIAN", "ESTONIAN", "SWEDISH", "LV", "ENG", "RUS", "GER", "IT", "ES", "LT", "UK", "ET", "SV");
        createAccount.setLanguages(scanner.nextLine().toUpperCase());  // should set loop to insert more languages
        if (langList.contains(createAccount.getLanguages())){
            System.out.println("Language set!");
        } else {
            System.out.println("Language not recognized, try again!");
        }

        System.out.println("Insert any important additional information");
        createAccount.setInfo(scanner.nextLine());// Check if person with that name... exist

        currentUserId = DataBase.createUser(createAccount.getUsername(), createAccount.getPassword(), createAccount.getName(),
                                            createAccount.geteMail(), createAccount.getPhone(), createAccount.getLanguages(), createAccount.getInfo());
    }

    public static void logIn() throws Exception{
        Scanner scanner = new Scanner(System.in);
        UserInfo currentUser = new UserInfo();
        System.out.println("Insert username");
        currentUser.setUsername(scanner.nextLine());
        System.out.println("Insert password");
        currentUser.setPassword(scanner.nextLine());

        int userId = DataBase.checkLogin(currentUser.getUsername(), currentUser.getPassword());
        if (userId>0) {
            System.out.println("You have logged in successfully!");
            currentUserId = userId;
        } else {
            System.out.println("Username or password not correct!");
        }


        //check in database
    }
}
