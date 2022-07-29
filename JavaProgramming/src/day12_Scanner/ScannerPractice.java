package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String result = "";
         result = (num>=1 && num<=7)? (num == 1)? "monday" :(num==2)? "tuesday":(num==3)? "wednesday":
                (num==4)? "thursday":(num==5)?"friday":(num==6)? "saturday"
                        : "sunday" :"invalid number";
        System.out.println(result);
        input.close();
    }
}
