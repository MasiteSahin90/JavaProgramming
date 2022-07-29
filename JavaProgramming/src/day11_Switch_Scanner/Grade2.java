package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {

        char ch = 'A';

        switch (ch){
            case 'A':

            case 'B':

            case 'C':

            case 'D':

                System.out.println("passed");
                break;
            case 'F':
                System.out.println("failed");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
