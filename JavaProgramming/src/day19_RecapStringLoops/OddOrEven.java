package day19_RecapStringLoops;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("enter a number");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("even");
            }
            if (num % 2 == 1) {
                System.out.println("odd");
            }
            System.out.println("would you like to continue yes/no");
            String answer = scan.next().toLowerCase();

            if(!(answer.equals("yes") || answer.equals("no"))){
                System.exit(0);
            }
            if(answer.equals("no")){
                System.out.println("thank you");
            }

        }
    }
}
