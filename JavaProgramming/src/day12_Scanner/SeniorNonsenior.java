package day12_Scanner;

import java.util.Scanner;

public class SeniorNonsenior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");


        int seniorcitizens = scan.nextInt();
        int nonseniorcitizens = scan.nextInt();

        System.out.println("What is new citizen's age?");
        int age = scan.nextInt();
        int result ;
        int result2 ;


        if (seniorcitizens>=65){
            System.out.println("Senior Citizen");
            result = seniorcitizens + 1;
            result2 = nonseniorcitizens;

        }else {
            System.out.println("Nonsenior Citizen");
            result = seniorcitizens;
            result2 = nonseniorcitizens + 1;
        }

        System.out.println("New seniorCitizens count " + result);
        System.out.println("New nonSeniorCitizens count " + result2);
    }
}
