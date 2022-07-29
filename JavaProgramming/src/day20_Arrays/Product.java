package day20_Arrays;

public class Product {
    public static void main(String[] args) {
        /*
        Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
        */
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        String report = "";

        int num = 0;
        boolean ipad = false;


        for (int i = 0; i < items.length - 1; i++) {
            String itemName = items[i];
            double itemPrice = prices[i];
            int itemID = itemIDs[i];

            if(itemName.equals("Gloves")){
                num = i;
            }

            if(itemName.equals("iPad")){
               ipad = true;
            }
              report += itemName + " - "+ itemPrice + " - " + itemID;
        }
        System.out.println("num = " + num);
        System.out.println("ipad = " + ipad);
        System.out.println("report = " + report);
    }
}
