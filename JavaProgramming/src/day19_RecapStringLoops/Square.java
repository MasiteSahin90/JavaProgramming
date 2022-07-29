package day19_RecapStringLoops;

import java.util.Scanner;

public class Square {
    /*
    2. Write a program that can calculate the area and perimeter of a
Square:
1. Ask the user "Enter the side of the
square:"
if user enters 0 or negative numbers,
terminate the program after displaying the error message "Invalid Entry
for the side of the square"
2. Display:
1. Area of square
2. Perimeter of square
3. Ask the user "Would you like to calculate
another Square?"
If "yes" --> repeat the
previous steps
If "No" --> Print "Thank you
for using Cydeo Square Calculator APP"
If user enters an invalid entry, ask
the user to re-enter until user provides a valid entry

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while(true){
            System.out.println("enter the side of the square");
            double side = scan.nextDouble();

            if(side<=0){
                System.err.println("Invalid Entry for the side of the square");
                break;
            }
            double perimeter = 4* side;
            double area = side * side;

            System.out.println("side = " + side);
            System.out.println("perimeter = " + perimeter);
            System.out.println("area = " + area);

            System.out.println("would you like to continue?");
            String ans = scan.next().toLowerCase();

            while(!(ans.equals("yes") || ans.equals("no"))){
                System.err.println("invalid entry , try again");
                ans = scan.next().toLowerCase();
            }
                if (ans.equals("no")){
                    System.out.println("Thank you for using Cydeo Square Calculator APP");
                    break;
                }
        }

scan.close();

    }
}
