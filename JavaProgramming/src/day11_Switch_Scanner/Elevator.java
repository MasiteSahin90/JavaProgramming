package day11_Switch_Scanner;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Create a class called Elevator. A variable named floorNumber is given, write a program that
         can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
            */
        System.out.println("enter a floor number");
        int floornum = input.nextInt();
        String result = "";
        String companies = "";
        if (floornum>=1 && floornum <=3){
            switch (floornum){
                case 1:
                    result ="Floor 1 seleced.";
                    companies = "Companies: Lobby, Verizon, Starbucks";
                    break;
                case 2:
                    result = "Floor 2 selected.";
                    companies = "Companies: Cybertek, NASA, Intelsat";
                    break;
                default:
                    result = "Floor 3 selected.";
                    companies = "Companies: Lyft, BofA, Stake house";
            }
        }else {
            result = "Invalid Floor";
        }
        System.out.println(result);
        System.out.println(companies);

    }
}
