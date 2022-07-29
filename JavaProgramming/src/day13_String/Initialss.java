package day13_String;

import java.util.Scanner;

public class Initialss {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("enter a string");

            String str = scan.nextLine();

            if(str.length() == 0){
                System.out.println("empty");
            }
            if(str.length()>=3){
                System.out.println(str.substring(str.length()-3));
            }
            if(str.length()<3){
                System.out.println(str);
            }

scan.close();

    }

}
