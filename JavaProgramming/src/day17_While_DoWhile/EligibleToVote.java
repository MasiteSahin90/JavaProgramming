package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("enter your age");
        int age = scan.nextInt();

        while (!(age>=1 && age <=120)) {
            System.err.println("invalid age , re-enter your age");
            System.err.println("enter your age");
            age = scan.nextInt();
        }

            System.out.println("are you uk citizen");
            String answer = scan.next().toLowerCase();

            while(!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("invalid answer, please re-enter");
                System.err.println("are you uk citizen");
                answer = scan.next().toLowerCase();
            }

            if(age>=18 && answer.equals("yes")){
                System.out.println("you are eligible to vote");
            }else{
                System.out.println("you are not eligible to vote");
            }
        scan.close();
        }

    }


