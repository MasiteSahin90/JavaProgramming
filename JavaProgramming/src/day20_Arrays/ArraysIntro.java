package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        String[] myGroup = new String[5];
        //System.out.println(myGroup);
        myGroup[0]="masuk";
        myGroup[1]="masuk";
        myGroup[2]="masuk";
        myGroup[3]="masuk";
        myGroup[4]="masuk";
        System.out.println(Arrays.toString(myGroup));


        System.out.println("--------------------------");


        String[] days = {"monday", "tuesday","wednesday",
        "thursday", "friday", "saturday", "sunday"};
        System.out.println(Arrays.toString(days));


        int number = 1;

        if(number<1 || number >7){
            System.err.println("invalid");
            System.exit(0);
        }

        System.out.println(days[number]);











    }
}
