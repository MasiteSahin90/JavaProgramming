package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        /*
        full name
        bulding number
        street name
        city name
        state
        postcode

         */
        Scanner input = new Scanner(System.in);

        System.out.println("enter your full name");
        String fullName = input.nextLine();

        System.out.println("enter your building number");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.println("enter your city name");
        String cityName = input.next();
        input.nextLine();
        System.out.println("enter your postcode");
        String postcode = input.next();
        input.nextLine();
        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("cityName = " + cityName);
        System.out.println("postcode = " + postcode);

        input.close();
    }
}
