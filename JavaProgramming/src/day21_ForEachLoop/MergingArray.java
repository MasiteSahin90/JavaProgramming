package day21_ForEachLoop;

import java.util.Arrays;

public class MergingArray {

    public static void main(String[] args) {
        String[] group1 = {"Ali","Ayse"};
        String[] group2 = {"veli","Heli"};

        String[] students = new String[group1.length + group2.length];

        int i = 0;
        for (String each : group1) {
            students[i++] = each;
        }

        for (String each : group2) {
            students[i++] = each;
        }

        System.out.println(Arrays.toString(students));


        System.out.println("-------------------------");


        char[] ch1 = {'A','B','C'};
        char[] ch2 =  {'d','e','f'};

        char[] ch3 = new char[ch1.length + ch2.length];

        int j = 0;
        for (char each : ch1) {
            ch3[j++] = each;
        }

        for (char each : ch2) {
            ch3[j++] = each;
        }

        System.out.println(Arrays.toString(ch3));

    }
}
