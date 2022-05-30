package projectHelpSorting;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.Set;

public class SortingMethodsList {

    public static void donateMoney() {
        Scanner scanner = new Scanner(System.in);
        double moneyDonation;

        System.out.println("Please follow instructions. Please insert donation amount: ");
        moneyDonation = scanner.nextInt();
        System.out.println("Please follow transactions instructions"); // Transaction process

        int donateMoneySql = DataBase.donateMoney(moneyDonation);
        if (donateMoneySql > 0) {
            System.out.println("Thank you for donation of " + moneyDonation + " EUR!");
            DataBase.readDonationAmount();
        } else {
            System.out.println("Something went wrong");
        }
    }

    public static void donateGoods() {
        Scanner scanner = new Scanner(System.in);
        String contin = "yes";

        while (contin.contains("yes")) {
            System.out.println("We are glad for your decision to donate goods. \n" +
                    "Press 1 to receive information about necessary goods \n " +
                    "Press 2 to receive donation point information");

            int choice = scanner.nextInt();
            if (choice == 1) {
                DataBase.readGoodsToDonate(); // reading data from table
            } else if (choice == 2) {
                System.out.println("Insert region of donation point: Riga / Jelgava / Valmiera / Liepaja / Ventspils / Daugavpils / Rezekne");
                Set<String> citiesList = Set.of("RIGA", "JELGAVA", "VALMIERA", "LIEPAJA", "VENTSPILS", "DAUGAVPILS", "REZEKNE");
                String region = getRegion(citiesList, scanner.next(), "Region set!", "Region not correct, try again!");
                System.out.printf("Donation point information at city %s\n", region);
                DataBase.readDonationPoint(region);
            }

            System.out.println("Would you like to continue with other goods donation information? yes / no");
            contin = scanner.next().toLowerCase();
        }
    }

    public static void transportation() {
        Scanner scannerText = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        String contin = "yes";

        System.out.println("Starting from what date you could offer help? Insert information in this format __/__/____"); // should put while loop, should check isn't date at pasts
        String date = scannerText.nextLine();
        LocalDate parsedDate;
        try {
            parsedDate = LocalDate.from(DateTimeFormatter.ofPattern("dd/MM/yyyy").parse(date));
        } catch (DateTimeParseException ex) {
            System.out.println("Data format error, try again");
        }
        System.out.println("Insert region from where you could start journey? Riga / Jelgava / Valmiera / Liepaja / Ventspils / Daugavpils / Rezekne");
        Set<String> cities = Set.of("RIGA", "JELGAVA", "VALMIERA", "LIEPAJA", "VENTSPILS", "DAUGAVPILS", "REZEKNE");
        String region = getRegion(cities, scannerText.nextLine(), "Region set!", "Region not correct, try again!");

        while (contin.equals("yes")) {
            System.out.println("Please choose what type transportation support you can offer:\n" +
                    "1 - Donate transport\n" +
                    "2 - Offer transport for some time\n" +
                    "3 - I can drive with my car\n" +
                    "4 - I can volunteer as driver\n");

            int choice = scannerInt.nextInt();
            String techCondition = "";
            String allWheelDrive = "";
            String stopDate = "";
            String categories = "";
            String availability = "";
            int seats = 0;
            if (choice == 1) {
                System.out.println("Please insert required information: "); // Code is repeating
                System.out.println("Is transport at good technical condition? yes / no ");
                techCondition = scannerText.nextLine().toUpperCase();
                System.out.println("Does car have four-wheel drive (4x4)? yes / no");
                allWheelDrive = scannerText.nextLine().toUpperCase();
                System.out.println("How many passenger seats transport have?");
                seats = scannerText.nextInt();

            } else if (choice == 2 || choice == 3) {
                System.out.println("Please insert required information: ");
                System.out.println("Till which date you can offer transport? Insert information in this format __/__/____"); //
                stopDate = scannerText.nextLine();
                try {
                    parsedDate = LocalDate.from(DateTimeFormatter.ofPattern("dd/MM/yyyy").parse(stopDate));
                } catch (DateTimeParseException ex) {
                    System.out.println("Data format error, try again");
                }

                System.out.println("Is transport at good technical condition? yes / no ");
                techCondition = scannerText.nextLine();

                System.out.println("Does car have four-wheel drive (4x4)? yes / no");
                allWheelDrive = scannerText.nextLine();

                System.out.println("How many passenger seats transport have?");
                seats = scannerInt.nextInt();

            } else if (choice == 4) { // How I can forward data to volunteering table as well

                System.out.println("Insert valid driving licence category: ");
                Set<String> categoriesList = Set.of("AM", "A1", "A2", "A", "B1", "B", "C1", "C", "D1", "D", "BE", "C1E", "CE", "D1E", "DE");
                categories = scannerText.nextLine().toUpperCase();
                if (categoriesList.contains(categories)) {
                    System.out.println("Set!");
                } else {
                    System.out.println("Not correct input, try again!");
                }

                System.out.println("Will you add some more categories? yes / no");
                contin = scannerText.nextLine().toLowerCase();
                while (contin.contains("yes")) {
                    System.out.println("Insert valid driving licence category: ");
                    categories = scannerText.nextLine().toUpperCase();
                    System.out.println("Will you add some more categories? yes / no");
                    contin = scannerText.nextLine().toLowerCase();
                }

                System.out.println("Insert your availability: Full time / Weekends / Working days / Other ");
                Set<String> availabilityList = Set.of("FULL TIME", "WEEKENDS", "WORKING DAYS", "OTHER");
                availability = scannerText.nextLine().toUpperCase();
                if (availabilityList.contains(availability)) {
                    System.out.println("Set!");
                } else {
                    System.out.println("Not correct input, try again!");
                }

            } else {
                System.out.println("Sorry, some mistake. Please try again!");
            }

            int offerTransportSql = DataBase.offerTransport(date, region, techCondition, allWheelDrive, seats, stopDate, categories, availability);
            if (offerTransportSql > 0) {
                System.out.println("Information inserted successfully!");
            } else {
                System.out.println("Something went wrong");
            }
            System.out.println("Would you like to insert another help offer? yes / no");
            contin = scannerText.nextLine().toLowerCase();
        }
    }

    public static void accommodation() {
        Scanner scannerText = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        String contin = "yes";

        while (contin.equals("yes")) {

            Set<String> cities = getCities();
            String region = getRegion(cities, scannerText.nextLine(), "Region set!", "Region not correct, try again!");
            System.out.println("Address: ");
            String address = scannerText.nextLine();
            System.out.println("Starting from what date accommodation is available? Insert information in this format __/__/____");
            String startDate = scannerText.nextLine();
            System.out.println("Till what date accommodation is available? Insert information in this format __/__/____");
            String stopDate = scannerText.nextLine();
            System.out.println("For how many persons you can offer accommodations?");
            int persons = scannerInt.nextInt();
            System.out.println("Do you allow pets? yes / no");
            String pets = scannerText.nextLine(); // doesn't rea data
            System.out.println("Is accommodation suitable for persons with disability? yes / no");
            String disability = scannerText.nextLine();
            System.out.println("Insert any additional information"); // could put as optional
            String addInfo = scannerText.nextLine();

            int offerAccommodationSql = DataBase.offerAccommodation(region, address, startDate, stopDate, persons, pets, disability, addInfo);
            if (offerAccommodationSql > 0) {
                System.out.println("Information inserted successfully!");
            } else {
                System.out.println("Something went wrong");
            }

            System.out.println("Would you like to insert another accommodation information? yes / no");
            contin = scannerText.nextLine().toLowerCase();
        }
    }

    public static void jobOffer() {
        Scanner scannerText = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        String quite = "yes";

        while (quite.equals("yes")) {
            System.out.println("Insert location of workplace: Riga / Jelgava / Valmiera / Liepaja / Ventspils / Daugavpils / Rezekne");
            Set<String> citiesList = Set.of("RIGA", "JELGAVA", "VALMIERA", "LIEPAJA", "VENTSPILS", "DAUGAVPILS", "REZEKNE");
            String region = getRegion(citiesList, scannerText.nextLine(), "Region set!", "Region not correct, try again!");

            System.out.println("Insert industry: Production / Client service / Finance / IT / Social care / Health care / Art");
            Set<String> industryList = Set.of("PRODUCTION", "CLIENT SERVICE", "FINANCE", "IT", "SOCIAL CARE", "HEALTH CARE", "ART");
            String industry = getRegion(industryList, scannerText.nextLine(), "Industry set!", "Industry not correct, try again!");

            System.out.println("How may workplace you can offer?");
            int workplaceCount = scannerInt.nextInt(); // doesn't read data after int variable
            System.out.println("Level of position: Entry / Junior / Specialist / Senior / Management");
            Set<String> levelList = Set.of("ENTRY", "JUNIOR", "SPECIALIST", "SENIOR", "MANAGEMENT");
            String level = getRegion(levelList, scannerText.nextLine(), "Level set!", "Level not correct, try again!");

            System.out.println("Insert offered gross salary: ");
            double salary = scannerInt.nextDouble();

            System.out.println("Insert any additional information");
            String addInfo = scannerText.nextLine();

            int offerJobSql = DataBase.jobOffersSql(region, industry, workplaceCount, level, salary, addInfo);
            if (offerJobSql > 0) {
                System.out.println("Information inserted successfully!");
            } else {
                System.out.println("Something went wrong");
            }

            System.out.println("Would you like to insert another job offers? yes / no");
            quite = scannerText.nextLine().toLowerCase();
        }
    }

    public static void healthCare() {
        Scanner scannerText = new Scanner(System.in);
        Scanner scannerNum = new Scanner(System.in);
        String contin = "yes";
        String quite = "yes";

        while (quite.equals("yes")) {

            System.out.println("Insert region of provided health care service: Riga / Jelgava / Valmiera / Liepaja / Ventspils / Daugavpils / Rezekne");
            Set<String> citiesList = Set.of("RIGA", "JELGAVA", "VALMIERA", "LIEPAJA", "VENTSPILS", "DAUGAVPILS", "REZEKNE");
            String region = getRegion(citiesList, scannerText.nextLine(), "Region set!", "Region not correct, try again!");
            System.out.println("Choose offered medical procedures: Dentistry / Diagnostic examination / Specialist consultations / Day Surgery / Surgery / Vaccination / Gynecology / Psychology / Other");
            String healthProc = scannerText.nextLine();
            System.out.println("Insert amount of offered procedures: ");
            int healthProcCount = scannerNum.nextInt();

            String languages = "";
            while (contin.equals("yes")) {
                System.out.println("Insert health specialist working languages: ");
                languages = scannerText.nextLine();
                System.out.println("Will you add some more languages? yes / no");
                contin = scannerText.nextLine().toLowerCase();
            }

            System.out.println("You can insert additional information here: ");
            String addInfo = scannerText.nextLine();

            int healthOffer = DataBase.healthCareSql(region, healthProc, healthProcCount, languages, addInfo);
            if (healthOffer > 0) {
                System.out.println("Information inserted successfully!");
            } else {
                System.out.println("Something went wrong");
            }

            System.out.println("Would you like to insert another health care services yes / no");
            quite = scannerText.nextLine().toLowerCase();
        }
    }

    public static void socialSupport() {
        Scanner scannerText = new Scanner(System.in);
        Scanner scannerNum = new Scanner(System.in);
        String contin = "yes";

        Set<String> cities = getCities();
        String region = getRegion(cities, scannerText.nextLine(), "Region set!", "Region not correct, try again!");
        while (contin.equals("yes")) {
            System.out.println("For how many persons you can offer help?");
            int count = scannerNum.nextInt();
            System.out.println("Insert social service specialists working languages: ");
            String languages = scannerText.nextLine();
            System.out.println("You can insert additional information here: ");
            String addInfo = scannerText.nextLine();

            int socialSupport = DataBase.socialSupportSql(region, count, languages, addInfo);
            if (socialSupport > 0) {
                System.out.println("Information inserted successfully!");
            } else {
                System.out.println("Something went wrong");
            }

            System.out.println("Would you like to insert another social support offer? yes / no");
            contin = scannerText.nextLine().toLowerCase();
        }
    }

    public static void volunteeringWork() {
        Scanner scanner = new Scanner(System.in);
        String quite = "yes";
        String contin = "yes";

        while (quite.equals("yes")) {

            Set<String> cities = getCities();
            String region = getRegion(cities, scanner.nextLine(), "Region set!", "Region not correct, try again!");
            String languages = "";
            while (contin.equals("yes")) {
                System.out.println("Insert health specialist working languages: ");
                languages = scanner.nextLine();
                System.out.println("Will you add some more languages? yes / no");
                contin = scanner.nextLine().toLowerCase();
            }

            System.out.println("At what sphere you would prefer to volunteer? Driver / Working at help center / Organising events / Mentor / Other ");
            String sphere = scanner.nextLine();
            System.out.println("You are available at what time period? Full time / Working day / Weekends / Evening hours / Few hours per month / Other");
            String workingHours = scanner.nextLine();
            System.out.println("You can insert additional information here: ");
            String addInfo = scanner.nextLine();

            int volunteeringWork = DataBase.volunteeringWorkSql(region, languages, sphere, workingHours, addInfo);
            if (volunteeringWork > 0) {
                System.out.println("Information inserted successfully!");
            } else {
                System.out.println("Something went wrong");
            }

            System.out.println("Would you like to insert another volunteer work preference? yes / no");
            quite = scanner.nextLine();
        }
    }

    public static void arrivalToLatvia() {

        System.out.println("Arrival in Latvia\n" +
                "Welcome to Latvia! Information that could help you:\n" +
                "A hotline for services and support available for Ukraine residents in Riga: +371 27 380 380 (available 24/7) \n" +
                "When traveling to Latvia, please bring valid travel documents, if you are able to. The absence of travel documents or medical documents" +
                " (vaccination certificate, Covid-19 test) will not be an obstacle for Ukrainian residents to enter Latvia. \n\t" +
                "\nCROSSING THE BOARD\nInformation on crossing the state border (24/7) is available by calling the State Border Guard +371 67913569, +371 67913568\n" +
                "The website of the State Border Guard website www.rs.gov.lv www.rs.gov.lv\n" +
                "The website of the Ministry of the Interior of Latvia www.iem.gov.lv/lv\n" +
                "PETS\nIf you have a pet traveling with you from Ukraine, please contact your nearest veterinarian to arrange a visit as soon as you " +
                "settle down. The veterinarian will examine, register, chip and vaccinate the animal free of charge. Phone +371 67095245." +
                " Website of the Food and Veterinary Service: www.pvd.gov.lv\n");

        System.out.println("To receive other type of help, continue with other options.");
    }

    public static void longTermStay() { //tekstu var iznest failā ko glabā klasē / direktorijā / utt
        System.out.println(" Ukrainian citizens who have a biometric passport do not need a visa for the first 90 days." +
                " Residents without a biometric passport will be issued a visa free of charge. " +
                "You have the right to apply for a long-term visa with the right to employment, or apply for asylum in Latvia. " +
                "More information here.\n" +
                "\n" +
                "A long-term visa will be issued for a one year term. The possibility of renewing the visa will depend on the further development of the situation in Ukraine. \n" +
                "\n" +
                "The Office of Citizenship and Migration Affairs\n" +
                "\n" +
                "Phone +371 67209422 and +371 67209400 (Monday - Thursday 8:30 - 16:00; Friday 9:00 - 15:00) You have the right to communicate " +
                "and receive answers in a language you understand and also to request the services of an interpreter. " +
                "More information on the OCMA website. \n" +
                "\n" +
                "You can apply for a visa:\n" +
                "\n" +
                "    In the Central Support Center for the Residents of Ukraine, Kalku Street 1, Riga\n" +
                "    OCMA territorial offices outside Riga\n" +
                "    by post or courier, sending documents to: OCMA Migration Division in Riga, Čiekurkalna 1.līnija 1, k-3, LV-1026 or any territorial division outside Riga\n" +
                "\n" +
                "Documents required when applying for a visa:\n" +
                "\n" +
                "    Copy of your passport (data section and pages with visas and / or border crossing marks).\n" +
                "    When sending documents by mail a 35mm x 45mm photo is required. No photo is required when submitting documents in person.\n" +
                "    Long-term visa application form.\n" +
                "\n" +
                "The visa will be issued in the same place where it was requested. Visa is free of charge.\n" +
                "\n" +
                "On-site state and municipal services are available at 138 State-Municipal Customer Service Centers (VPVKAC). " +
                "They provide assistance to Ukrainian civilians in applying for visas, residence permits and registration of natural persons. " +
                "The centers also provide advice and help to apply for e-services electronically.\n" +
                "\n");
    }

    public static void readSocialSupport() {
        DataBase.readSocialSupportSql(); // add option choose region
    }

    public static void readHelpCenters() {
        DataBase.readHelpCentersSql();
    }

    public static void readHealthHelp() {
        DataBase.readHealthHelpSql();
    }

    private static String getRegion(Set<String> cities, String s, String s2, String s3) {
        String region = s.toUpperCase();
        if (cities.contains(region)) {
            System.out.println(s2);
        } else {
            System.out.println(s3);
        }
        return region;
    }

    private static Set<String> getCities() {
        System.out.println("Insert region where accommodation is located? Riga / Jelgava / Valmiera / Liepaja / Ventspils / Daugavpils / Rezekne");
        return Set.of("RIGA", "JELGAVA", "VALMIERA", "LIEPAJA", "VENTSPILS", "DAUGAVPILS", "REZEKNE");
    }

}
