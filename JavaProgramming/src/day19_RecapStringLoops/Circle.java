package day19_RecapStringLoops;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        /*
        1. Write a program that can calculate the area and perimeter of a
circle:
1. Ask the user "Enter the radius of the
circle:"
if user enters 0 or negative numbers,
terminate the program after displaying the error message "Invalid Entry
for the radius of the circle"
2. Display:
1. Diameter of circle
2. Area of circle
3. Perimeter of circle
3. Ask the user "Would you like to calculate
another circle?"
If "yes" --> repeat the
previous steps
If "No" --> Print "Thank you
for using Cydeo Circle Calculator APP"
If user enters an invalid entry, ask
the user to re-enter until user provides a valid entry
         */
        Scanner scan = new Scanner(System.in);


        double area = 0;
        double perimeter = 0;


        while(true) {

            System.out.println("enter the radius of the circle");
            double r = scan.nextDouble();

            if(r<=0){
                System.err.println("invalid entry");
                System.exit(0);
            }
                area = r*r*3.14;
                perimeter = 2 * 3.14 * r;
                System.out.println("r = " + r);
                System.out.println("area = " + area);
                System.out.println("perimeter = " + perimeter);


            System.out.println("would you like to continue");
            String ans = scan.next().toLowerCase();
            while(!(ans.equals("yes") || ans.equals("no"))) {

                System.err.println("invalid entry , would you like to continue ");
                ans = scan.next().toLowerCase();

            }
                if (ans.equals("no")) {
                    System.out.println("Thank you for using Cydeo Circle Calculator APP");
                    break;
                }


        }

scan.close();
    }
}
