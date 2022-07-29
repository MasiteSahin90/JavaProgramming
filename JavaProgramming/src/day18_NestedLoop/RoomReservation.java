package day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        /*
        Create a class called RoomReservation, write a program for the room
reservation:
King Bed ==> 120$
Queen Bed ==> 100$
single Bed ==> 80$
the program asks the user which bedroom does he/she wants to
reserve, and how many nights he/she is staying.
Then Ask the user "would you like to reserve another room?""
if yes ==> repeat the entire steps
if no ==> return the  total price
If user enters any invalid entry,  ask the user to re-
enter until user provides a valid entry
         */

        Scanner scan = new Scanner (System.in);

        while(true){
            System.out.println("which bedroom do you want");
            String answer = scan.nextLine().toLowerCase();
            System.out.println("\t\tKing Bed == $120");
            System.out.println("\t\tQueen Bed == $100");
            System.out.println("\t\tSingle Bed == $80");
            System.out.println("how many days do you want to stay");
            int n = scan.nextInt();
            System.out.println("would you like to reserve another room");
             String a = scan.next().toLowerCase();
             while (!(a.equals("yes") || a.equals("no"))){
                 System.out.println("invalid re enter");
             }
             if(a.equals("no")){
                 break;
             }

        }


    }
}
