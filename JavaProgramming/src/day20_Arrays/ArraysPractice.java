package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        int[] num = {10 , 20 , 50 , 70};

        System.out.println(Arrays.toString(num));

        System.out.println("---------------------");

        int[] scores = new int[5];

        scores[1] =85;
        scores[scores.length-1]=90;
        scores[3]= 43;
        scores[0]=89;
        scores[2]=99;
        System.out.println(Arrays.toString(scores));

        System.out.println("-------------------");

        String[] months = {"january", "february","march","april"
        ,"may", "june", "july" ,"august","september","october",
                "november","december"};

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        System.out.println("-------------------");
        for (int i = months.length-1; i>=0; i--) {
            System.out.println(months[i]);
        }










    }
}
