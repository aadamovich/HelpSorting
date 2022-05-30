package projectHelpSorting;

import java.sql.*;

public class DataBase {

    static String dbURL = "jdbc:mysql://localhost:3306/java27";
    static String user = "root";
    static String passwordSql = "Skolasiela37";


    public static int createUser(String username, String password, String name, String eMail, String phone, String languages, String info){
        try (Connection conn = DriverManager.getConnection(dbURL, user, passwordSql)) {

            String sql = "INSERT INTO Account (username, password, name, eMail, phone, languages, info) VALUES (?, ?, ?, ?, ?, ?, ?);";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, name);
            preparedStatement.setString(4, eMail);
            preparedStatement.setString(5, phone);
            preparedStatement.setString(6, languages);
            preparedStatement.setString(7, info);

            preparedStatement.executeUpdate();


            //to get the ID of the current user
            String sqlID = "SELECT * FROM users WHERE username ='" + username + "' and password ='" + password + "'";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlID);


            if (resultSet.next()) {
                return resultSet.getInt(1);//returns current users ID Nr.
            } else {
                return 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  0;
    }


    public static int checkUserName(String username){

        try (Connection conn = DriverManager.getConnection(dbURL, user, passwordSql)) {
            String sqlUser = "SELECT * FROM Account WHERE username ='" + username + "'";

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlUser);

            if (resultSet.next()) {

                //returns Users ID Nr.
                return resultSet.getInt(1);
            } else {
                return 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int checkLogin(String username, String password){

        try (Connection conn = DriverManager.getConnection(dbURL, user, passwordSql)) {
            String sql = "SELECT * FROM users WHERE username ='" + username + "' and password ='" + password + "'";

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                //returns current Users ID Nr.
                return resultSet.getInt(1);
            } else {
                return 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int donateMoney(double moneyDonation){
        try (Connection conn = DriverManager.getConnection(dbURL, user, passwordSql)){
            String sql = "INSERT INTO DonateMoney (moneyDonation) VALUES (?);";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setDouble(1, moneyDonation);

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 1;
    }

    public static void readDonationAmount() {
        String output = null;
        double donation = 0;
        try (Connection conn = DriverManager.getConnection(dbURL, user, passwordSql)) {
            String sql = "SELECT SUM(moneyDonation) FROM DonateMoney";

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                donation = resultSet.getDouble(1);
                output = " Since start of program together we donated %.2f EUR";
                // System.out.println(String.format(output, donation));
            }
            System.out.println(String.format(output, donation));

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void readGoodsToDonate() {

        try (Connection conn = DriverManager.getConnection(dbURL, user, passwordSql)) {
            String sql = "SELECT * FROM DonateGoods"; // TODO could read data from last record

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                String goods = resultSet.getString("necessaryGoods");
                String date = resultSet.getString("actualizationDate");

                System.out.printf("Necessary goods on date: %s\n%s\n",date, goods);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void readDonationPoint(String region) {

        try (Connection conn = DriverManager.getConnection(dbURL, user, passwordSql)) {
            String sql = "SELECT * FROM DonationPoints WHERE city = '" + region + "'";  // TODO could read data from last record

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                String city = resultSet.getString("city");
                String address = resultSet.getString("address");
                String workingTime = resultSet.getString("workingTime");
                String contactInfo = resultSet.getString("contactInfo");

                System.out.printf("%s\n%s\n%s\n%s\n",city, address, workingTime, contactInfo);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static int offerTransport(String date, String region, String techCondition, String allWheelDrive, int seats, String stopDate, String categories, String availability) {

        try (Connection conn = DriverManager.getConnection(dbURL, user, passwordSql)) {
            String sql = "INSERT INTO offerTransport (startDate, region, techCondition, allWheelDrive, seats, stopDate, categories, availability) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, date);
            preparedStatement.setString(2, region);
            preparedStatement.setString(3, techCondition);
            preparedStatement.setString(4, allWheelDrive);
            preparedStatement.setInt(5, seats);
            preparedStatement.setString(6, stopDate);
            preparedStatement.setString(7, categories);
            preparedStatement.setString(8, availability);

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    public static int offerAccommodation(String region, String address, String startDate, String stopDate, int persons, String pets, String disability, String addInfo) {

        try (Connection conn = DriverManager.getConnection(dbURL, user, passwordSql)) {
            String sql = "INSERT INTO Accommodation (region, address, startDate, stopDate, persons, pets, disability, addInfo) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, region);
            preparedStatement.setString(2, address);
            preparedStatement.setString(3, startDate);
            preparedStatement.setString(4, stopDate);
            preparedStatement.setInt(5, persons);
            preparedStatement.setString(6, pets);
            preparedStatement.setString(7, disability);
            preparedStatement.setString(8, addInfo);

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    public static int jobOffersSql(String region, String industry, int workplaceCount, String level, double salary, String addInfo) {

        try (Connection conn = DriverManager.getConnection(dbURL, user, passwordSql)) {
            String sql = "INSERT INTO JobOffers (region, industry, workplaceCount, levelExp, salary, addInfo) VALUES (?, ?, ?, ?, ?, ?);";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, region);
            preparedStatement.setString(2, industry);
            preparedStatement.setInt(3, workplaceCount);
            preparedStatement.setString(4, level);
            preparedStatement.setDouble(5, salary);
            preparedStatement.setString(6, addInfo);

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    public static int healthCareSql(String region, String healthProc, int healthProcCount, String languages,String addInfo) {

        try (Connection conn = DriverManager.getConnection(dbURL, user, passwordSql)) {
            String sql = "INSERT INTO healthCareOffer (region, healthProc, healthProcCount, languages, addInfo) VALUES (?, ?, ?, ?, ?);";

           PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, region);
            preparedStatement.setString(2, healthProc);
            preparedStatement.setInt(3, healthProcCount);
            preparedStatement.setString(4, languages);
            preparedStatement.setString(5, addInfo);

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    public static int socialSupportSql(String region, int count, String languages, String addInfo) {

        try (Connection conn = DriverManager.getConnection(dbURL, user, passwordSql)) {
            String sql = "INSERT INTO socialSupportOffer (region, count, languages, addInfo) VALUES (?, ?, ?, ?);";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, region);
            preparedStatement.setInt(2, count);
            preparedStatement.setString(3, languages);
            preparedStatement.setString(4, addInfo);

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    public static int volunteeringWorkSql(String region, String languages, String sphere, String workingHours, String addInfo) {

        try (Connection conn = DriverManager.getConnection(dbURL, user, passwordSql)) {
            String sql = "INSERT INTO volunteeringWorkOffer (region, languages, sphere, workingHours, addInfo) VALUES (?, ?, ?, ?, ?);";

            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, region);
            preparedStatement.setString(2, languages);
            preparedStatement.setString(3, sphere);
            preparedStatement.setString(4, workingHours);
            preparedStatement.setString(5, addInfo);

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    public static void readSocialSupportSql(){  //Should add option with authorization, without, select regarding to region
        String output = null;
        try (Connection conn = DriverManager.getConnection(dbURL, user, passwordSql)) {
            String sql = "SELECT * FROM socialSupportOffer";

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                int socialSupportOfferID = resultSet.getInt("socialSupportOfferID");
                String region = resultSet.getString("region");
                String languages = resultSet.getString("languages");
                String addInfo = resultSet.getString("addInfo");
                output = "Social offers you can choose:\n\tOffer id: %d\n\tRegion: %s \n\tCommunication language: %s\n\tInformation: %s\n";

                System.out.println(String.format(output,socialSupportOfferID, region, languages,addInfo));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void readHelpCentersSql(){  //Should add option choose by region or print all
        String output = null;
        try (Connection conn = DriverManager.getConnection(dbURL, user, passwordSql)) {
            String sql = "SELECT * FROM HelpCenter";

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                int helpCenterID = resultSet.getInt("helpCenterID");
                String city = resultSet.getString("city");
                String address = resultSet.getString("address");
                String workingTime = resultSet.getString("workingTime");
                String contactInfo = resultSet.getString("contactInfo");
                output = "Help centers information:\n\tHelp Center id: %d\n\tCity: %s \n\tAddress: %s\n\tWorking time: %s\n\tContact info: %s";

                System.out.println(String.format(output,helpCenterID, city, address, workingTime, contactInfo));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void readHealthHelpSql(){  //Should add option choose by region or print all
        String output = null;
        try (Connection conn = DriverManager.getConnection(dbURL, user, passwordSql)) {
            String sql = "SELECT * FROM healthCareOffer";

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                int healthCareOfferID = resultSet.getInt("healthCareOfferID");
                String region = resultSet.getString("region");
                String healthProc = resultSet.getString("healthProc");
                String languages = resultSet.getString("languages");
                String addInfo = resultSet.getString("addInfo");
                output = "Health procedures information:\n\tProcedures id: %d\n\tCity: %s \n\tHealth procedure: %s\n\tWorking language: %s\n\tAdditional information: %s";

                System.out.println(String.format(output,healthCareOfferID, region, healthProc, languages, addInfo));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}

