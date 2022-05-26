package basics;

import java.lang.reflect.Array;
import java.sql.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
    }
    }
/*
        package finalProject;
import java.sql.*;
import java.util.Scanner;

        public class MainCountry {
            private static Scanner scanner = new Scanner(System.in);
            private static finalProject.countryList countryList = new countryList();

            public static void main(String[] args) {

                boolean quit = false;
                int choice = 0;
                final String dbURL = "jdbc:mysql://localhost:3306/java27";
                final String user = "root";
                final String password = "Skolasiela37";

                try (Connection conn = DriverManager.getConnection(dbURL, user, password)) {

                    readUsersLatvia(conn);
                    readUsersSpain(conn);
                    readUsersVatican(conn);
                    readUsersMonaco(conn);
                    readUsersWonderland(conn);

                    printInstructions();
                    System.out.println("Enter your name and surname:");
                    String name = scanner.nextLine(); // Could implement in code name

                    while (!quit) {
                        System.out.printf("%s, Enter your country number:\n", name);
                        choice = scanner.nextInt();
                        scanner.nextLine();

                        switch (choice) {
                            case 0:
                                Latvia(conn);
                                break;
                            case 1:
                                Spain(conn);
                                break;
                            case 2:
                                Vatican(conn);
                                break;
                            case 3:
                                Monaco(conn);
                                break;
                            case 4:
                                Wonderland(conn);
                                break;
                            case 5:
                                quit = true;
                                break;
                        }
                    }
                } catch (SQLException e) {
                    System.out.println("MAIN - Error, try again!");
                }
            }

            public static void printInstructions() {

                System.out.println("\nPlease choose country in which you are are having income:");
                System.out.println("\t 0 - Latvia");
                System.out.println("\t 1 - Spain");
                System.out.println("\t 2 - Vatican");
                System.out.println("\t 3 - Monaco");
                System.out.println("\t 4 - Wonderland");
                System.out.println("\t 5 - To quit the application");
            }

            public static void Latvia(Connection conn) throws SQLException {

                System.out.println("Enter number of children:");
                int children = scanner.nextInt();
                System.out.println("Enter your not applicable minimum:");
                double minimum = scanner.nextDouble();
                System.out.println("Enter your gross income:");
                double grossIncome = scanner.nextDouble();
                System.out.println("Do you have disability?"); // works only if you write true or false, need instructions
                boolean disability = scanner.nextBoolean();
                System.out.println("Are you a pensioner?"); // works only if you write true or false, need instructions
                boolean pensioner = scanner.nextBoolean();

                try {
                    countryList.Latvia(conn, children, minimum, grossIncome, disability, pensioner);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

            public static void Spain(Connection conn) throws SQLException {

                System.out.println("If you work in private sector please press 1, if in governmental sector press 2.");
                int industry = scanner.nextInt();
                System.out.println("Enter your gross income:");
                double grossIncome = scanner.nextDouble();
                System.out.println("Enter your rent:");
                double rent = scanner.nextDouble();
                System.out.println("Enter your mortgage:");
                double mortgage = scanner.nextDouble();
                System.out.println("Enter your donations:");
                double donations = scanner.nextDouble();
                countryList.Spain(conn, industry, grossIncome, rent, mortgage, donations);
            }

            public static void Vatican(Connection conn) throws SQLException {
                System.out.println("Are you a pop?");
                boolean pop = scanner.nextBoolean();
                System.out.println("Do you believe in God?");
                boolean god = scanner.nextBoolean();
                System.out.println("Enter your gross income:");
                double grossIncome = scanner.nextDouble();
                countryList.Vatican(conn, pop, god, grossIncome);
            }

            public static void Monaco(Connection conn) throws SQLException {
                System.out.println("How many months are you residenting in Monaco?");
                int months = scanner.nextInt();
                System.out.println("Enter amount of deposit in Monaco bank:");
                double deposit = scanner.nextDouble();
                System.out.println("Enter amount of gross Income in Monaco bank:");
                double grossIncome = scanner.nextDouble();
                countryList.Monaco(conn, months, deposit, grossIncome);
            }

            public static void Wonderland(Connection conn) throws SQLException {
                System.out.println("Do you have pets? For cat press 1, for dog press 2.");
                int pet = scanner.nextInt();
                System.out.println("Enter your gross income:");
                double grossIncome = scanner.nextDouble();
                countryList.Wonderland(conn, pet, grossIncome);
            }

            public static void readUsersLatvia(Connection conn) throws SQLException {
                String sql = "SELECT * FROM usersLatvia;";

                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {

                    int personID = resultSet.getInt("PersonID");
                    int pensioner = resultSet.getInt("Pensioner");
                    int disability = resultSet.getInt("Disability");
                    double minimum = resultSet.getDouble("Minimum");
                    double grossIncome = resultSet.getDouble("GrossIncome");
                    int children = resultSet.getInt("Children");

                    String output = "Users Latvia info: \n\t id: %d \n\t Pensioner: %d \n\t" +
                            "Disability: %d \n\t Minimum: %.2f \n\t Gross Incomes: %.2f \n\t Children: %d";

                    System.out.println(String.format(output, personID, pensioner, disability, minimum, grossIncome, children));
                }
            }

            public static void readUsersSpain(Connection conn) throws SQLException {
                String sql = "SELECT * FROM usersSpain;";

                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {

                    int personID = resultSet.getInt("PersonID");
                    double grossIncome = resultSet.getDouble("GrossIncome");
                    int industry = resultSet.getInt("Industry");
                    double rent = resultSet.getDouble("Rent");
                    double mortgage = resultSet.getDouble("Mortgage");
                    double donations = resultSet.getDouble("Donations");

                    String output = "Users Spain info: \n\t id: %d \n\t Gross Incomes: %.2f \n\t Industry: %d \n\t " +
                            "Rent: %.2f \n\t Mortgage: %.2f \n\t Donations: %.2f";

                    System.out.println(String.format(output, personID, grossIncome, industry, rent, mortgage, donations));
                }
            }

            public static void readUsersVatican(Connection conn) throws SQLException {
                String sql = "SELECT * FROM usersVatican;";

                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {

                    int personID = resultSet.getInt("PersonID");
                    double grossIncome = resultSet.getDouble("GrossIncome");
                    int pop = resultSet.getInt("Pop");
                    int god = resultSet.getInt("God");

                    String output = "Users Vatican info: \n\t id: %d \n\t Gross Incomes: %.2f  \n\t Pop: %d \n\t God: %d";

                    System.out.println(String.format(output, personID, grossIncome, pop, god));
                }
            }

            public static void readUsersMonaco(Connection conn) throws SQLException {
                String sql = "SELECT * FROM usersMonaco;";

                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {

                    int personID = resultSet.getInt("PersonID");
                    double grossIncome = resultSet.getDouble("GrossIncome");
                    int month = resultSet.getInt("Month");
                    double deposit = resultSet.getDouble("Deposit");

                    String output = "Users Monaco info: \n\t id: %d \n\t  Gross Incomes: %.2f \n\t Month: %d \n\t Deposit: %.2f";

                    System.out.println(String.format(output, personID, grossIncome, month, deposit));
                }
            }

            public static void readUsersWonderland(Connection conn) throws SQLException {
                String sql = "SELECT * FROM usersWonderland;";

                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {

                    int personID = resultSet.getInt("PersonID");
                    double grossIncome = resultSet.getDouble("GrossIncome");
                    int pet = resultSet.getInt("Pet");

                    String output = "Users Wonderland info: \n\t id: %d  \n\t Gross Incomes: %.2f \n\t Pet %d";

                    System.out.println(String.format(output, personID, grossIncome, pet));
                }
            }
        }
*/


/*package finalProject;

        import javax.sound.midi.Soundbank;
        import java.sql.Connection;
        import java.sql.PreparedStatement;
        import java.sql.SQLException;
        import java.util.Random;
        import java.util.Scanner;

public class countryList {

    Scanner scanner = new Scanner(System.in);

    public void Latvia(Connection conn,int children, double minimum, double grossIncome, boolean disability, boolean pensioner)throws Exception{

        String sql = "INSERT INTO usersLatvia(pensioner, disability, minimum, grossIncome, children) VALUES (?, ?, ?, ?, ?);";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        preparedStatement.setBoolean(1, pensioner);
        preparedStatement.setBoolean(2, disability);
        preparedStatement.setDouble(3, minimum);
        preparedStatement.setDouble(4, grossIncome);
        preparedStatement.setInt(5,children);

        int rowLatvia = preparedStatement.executeUpdate();

        if(rowLatvia > 0){
            System.out.println("A new user was inserted successfully");
        }else {
            System.out.println("Something went wrong");
        }

        int pens;
        if (pensioner = true) {
            pens = 300;
        } else {
            pens = 0;
        }
        int dis;
        if (disability = true) {
            dis = 150;
            minimum = 0;
        } else {
            dis = 0;
        }
        //social tax
        double socialTax = grossIncome * 0.105;
        System.out.println("Your social tax is " + socialTax);

        //income tax rate
        double yearIncome = grossIncome * 12;

        if(yearIncome <= 20004){
            double incomeTaxRate = 0.20;
        } else if (yearIncome <= 78100){
            double incomeTaxRate = 0.23;
        } double incomeTaxRate = 0.31;
        System.out.println("Your income tax rate is " + incomeTaxRate);

        //income tax
        double incomeTax = (grossIncome - socialTax - children * 250 - minimum - dis - pens) * incomeTaxRate;

        //netSalary
        double netIncome = grossIncome - socialTax - incomeTax;
        System.out.println("Your net income is: " + netIncome);
    }

    public void Spain(Connection conn,int industry, double grossIncome, double rent, double mortgage, double donations)throws SQLException{

        String sql = "INSERT INTO usersSpain (industry, grossIncome, rent, mortgage, donations) VALUES (?, ?, ?, ?, ?);";

        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        preparedStatement.setInt(1,industry);
        preparedStatement.setDouble(2, grossIncome);
        preparedStatement.setDouble(3, rent);
        preparedStatement.setDouble(4, mortgage);
        preparedStatement.setDouble(5,donations);

        int rowSpain = preparedStatement.executeUpdate();

        if(rowSpain > 0){
            System.out.println("A new user was inserted successfully");
        }else {
            System.out.println("Something went wrong");
        }

        if(industry == 1){double socialTaxRate = 0.1d;} double socialTaxRate = 0.05d;
        System.out.println("Your income tax rate is " + socialTaxRate);
        //social tax
        double socialTax = grossIncome * socialTaxRate;
        System.out.println("Your social tax is " + socialTax);
        //income tax rate
        double yearIncome = grossIncome * 12;

        if(yearIncome <= 12450){
            double incomeTaxRate = 0.19;
        } else if (yearIncome <= 20200){
            double incomeTaxRate = 0.24;
        } else if (yearIncome <=35200){
            double incomeTaxRate = 0.30;
        }else if(yearIncome <= 60000){
            double incomeTaxRate = 0.37;
        } double incomeTaxRate = 0.45;
        System.out.println("Your income tax rate is " + incomeTaxRate);

        //income tax
        double incomeTax = (grossIncome - socialTax - rent - mortgage - donations) * incomeTaxRate;
        //netSalary
        double netIncome = grossIncome - socialTax - incomeTax;
        System.out.println("Your net income is: " + netIncome);
    }

    public void Vatican(Connection conn, boolean pop, boolean god, double grossIncome)throws  SQLException {

        String sql = "INSERT INTO usersVatican (pop, god, grossIncome) VALUES (?, ?, ?);";

        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        preparedStatement.setBoolean(1, pop);
        preparedStatement.setBoolean(2, god);
        preparedStatement.setDouble(3, grossIncome);

        int rowVatican = preparedStatement.executeUpdate();

        if(rowVatican > 0){
            System.out.println("A new user was inserted successfully");
        }else {
            System.out.println("Something went wrong");
        }

        double incomeTaxRate;
        if(pop == true) {incomeTaxRate = 0.05d;} else {incomeTaxRate = 0;}

        double GODincomeTaxRate;
        if(god == true) {GODincomeTaxRate = 0;} else {GODincomeTaxRate = 0.20d;}

        System.out.println("Your income tax rate is " + incomeTaxRate);
        //income tax
        double incomeTax = grossIncome * incomeTaxRate;
        double GODincomeTax = grossIncome * GODincomeTaxRate;
        //netSalary
        double netIncome = grossIncome + incomeTax - GODincomeTax;
        System.out.println("Your net income is: " + netIncome);
    }

    public void Monaco(Connection conn, int months, double deposit, double grossIncome)throws SQLException{

        String sql = "INSERT INTO usersMonaco (month, deposit, grossIncome) VALUES (?, ?, ?);";

        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        preparedStatement.setInt(1, months);
        preparedStatement.setDouble(2, deposit);
        preparedStatement.setDouble(3, grossIncome);

        int rowMonaco = preparedStatement.executeUpdate();

        if(rowMonaco > 0){
            System.out.println("A new user was inserted successfully");
        }else {
            System.out.println("Something went wrong");
        }

        double incomeTaxRate = 0;
        if (months < 3 && deposit >= 500000d) {
            incomeTaxRate = 0;
        }
        else if (months > 3){
            incomeTaxRate = 0.5d;
        }

        System.out.println("Your income tax rate is " + incomeTaxRate);
        //income tax
        double incomeTax = grossIncome * incomeTaxRate;
        //netSalary
        double netIncome = grossIncome + incomeTax;
        System.out.println("Your net income is: " + netIncome);
    }

    public void Wonderland(Connection conn, int pet, double grossIncome)throws SQLException{

        String sql = "INSERT INTO usersWonderland (pet, grossIncome) VALUES (?, ?);";

        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        preparedStatement.setInt(1, pet);
        preparedStatement.setDouble(2, grossIncome);

        int rowWonderland = preparedStatement.executeUpdate();

        if(rowWonderland > 0){
            System.out.println("A new user was inserted successfully");
        }else {
            System.out.println("Something went wrong");
        }

        double incomeTaxRate;
        if(pet == 1) {incomeTaxRate = 0.05d;} else {incomeTaxRate = 0.1d;}

        System.out.println("Your income tax rate is " + incomeTaxRate);
        //income tax
        double incomeTax = grossIncome * incomeTaxRate;
        //netSalary
        double netIncome = grossIncome - incomeTax;
        Random generator = new Random();
        double num = generator.nextDouble()*(0.5d-0) + 0;
        double randTax = grossIncome * num;
        System.out.println("Your random tax: " + num);

        System.out.println("Your net income is: " + netIncome);

        double netIncome2 = grossIncome - randTax - incomeTax;
        System.out.println("Your net income is: " + netIncome2);
    }

}*/
