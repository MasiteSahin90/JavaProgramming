package Oscar.week14;

import java.util.Arrays;
import java.util.Scanner;

public class ShopListMakerApp {



    public static Scanner scanner; // global variable for this class

    static int x; //we can use x in everywhere because it is a global variable

    public static void main(String[] args) {
        GroceryList list = new GroceryList();

        printInstructions();

        //Scanner scan = new Scanner(System.in);

        boolean toContinue = true;

        while (toContinue){
            System.out.println("Enter your next choice: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println(list);
                case 2:
                    System.out.println("Enter your grocery item");
                    list.addAnItem(scanner.nextLine());
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Enter item number to be modified : ");
                    int itemNo = scanner.nextInt();
                    String newItem = scanner.nextLine();
                    list.modifyAnItem(itemNo,newItem);
                    break;
                case 4:
                    System.out.println("Enter the item number that will be removed");
                    int itemNumber = scanner.nextInt();
                    list.removeAnItem(itemNumber);
                    break;
                case 6:
                    toContinue = false;
                    break;
            }

        }




    }

    public static void printInstructions() {
        x=10;
        scanner = new Scanner(System.in);  //initialize
        System.out.println("Select : ");
        System.out.println("\t 0 - To print many options.");
        System.out.println("\t 1 - To print list of shopping items.");
        System.out.println("\t 2 - To add an item in the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item in the list");
        System.out.println("\t 5 - To search an item in the list");
        System.out.println("\t 6 - Quit the application");
    }



}
