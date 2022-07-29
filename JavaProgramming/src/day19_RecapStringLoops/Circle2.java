package day19_RecapStringLoops;

import java.util.Scanner;

public class Circle2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

            while(true) {
                double dia = 0;
                double per = 0;
                double area = 0;

                System.out.println("enter the radius");
                double r = scan.nextDouble();

                if (r <= 0) {
                    System.out.println("invalid entry");
                    System.exit(0);
                }

                dia = 2 * r;
                per = 2 * 3.14 * r;
                area = r * r * 3.14;

                System.out.println("dia = " + dia);
                System.out.println("per = " + per);
                System.out.println("area = " + area);

                System.out.println("continue?");
                String answer = scan.next().toLowerCase();
                while(!(answer.equals("yes") || answer.equals("no"))) {
                    System.err.println("invalid , re enter");
                    answer = scan.next().toLowerCase();
                }

                if (answer.equals("no")){
                    System.out.println("thank you bye");
                    break;
                }







            }



    }
}
