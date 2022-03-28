package advanced1.grocery;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();


    public static void main(String[] args) {

    boolean quit = false;
    int choice = 0;

    printInstructions();

    while (!quit){
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            case 0:
                // print all option
                 printInstructions();
                break;
            case 1:
                // print grocery list
                groceryList.printGroceryList();
                break;
            case 2:
                // adding item
                addItem();
                break;
            case 3:
                //Modify item
                modifyItem();
                break;
            case 4:
                //remove item
                removeItem();
                break;
            case 5:
                //searching item
                //searchItem();
                break;
            case 6:
                quit = true;
                break;
        }
    }

    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter number of item you want to replace");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo - 1, newItem);
    }

    public static void removeItem(){
        System.out.println("Enter item name: ");
        groceryList.removeGroceryItem(scanner.nextLine());
    }



}


