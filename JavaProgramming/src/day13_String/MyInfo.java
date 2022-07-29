package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your age");
        int age = scan.nextInt();

        System.out.println("enter your gender");
        String  gender = scan.next();

        scan.nextLine();

        System.out.println("full name");
        String fullName = scan.nextLine();
        // next line dan onceki satir next line degilse araya next line eklemek lazim

        System.out.println("enter your phone number");
        long phoneNumber = scan.nextLong();

        System.out.println("enter your zip code");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("school name ");
        String schoolName = scan.nextLine();

        System.out.println("city name ");
        String city = scan.nextLine();

        System.out.println("state name");
        String state = scan.nextLine();

        System.out.println("bulding number");
        int building = scan.nextInt();

        scan.nextLine();

        System.out.println("street name");
        String street = scan.nextLine();
        scan.close();
        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("address:");
        System.out.println("\t" + building + "\t" +street
        + "\n\t"+ city + ", " + state + " " + zipCode);
        System.out.println("schoolName = " + schoolName);

    }
}
