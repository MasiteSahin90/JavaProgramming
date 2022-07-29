package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        String[] countries = {"Turkey","United Kingdom", "Poland","Japan","United States","China","Sweden"};

        ArrayList<String> coun = new ArrayList<>(Arrays.asList(countries));

        coun.removeIf(p -> p.length()>=10);

       countries =  coun.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));


    }
}
