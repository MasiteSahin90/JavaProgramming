package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabbbcccddeeefgh";

        String[] arr = str.split("");

        ArrayList<String> arrr = new ArrayList<>(Arrays.asList(arr));

        System.out.println(arrr);

        String unique = "";
        for (String each : arrr) {
           int freq =  Collections.frequency(arrr,each);
            if(freq == 1){
                unique+=each;
            }
        }
        System.out.println(unique);


    }
}
