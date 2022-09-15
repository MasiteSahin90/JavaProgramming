package day52_Map_FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class HighestFrequency {

    public static void main(String[] args) {

        String str = "eeeeeaaabbbbccccdd";

        String[] arr = str.split("");

        Map<String,Integer> result = new LinkedHashMap<>();

        int max = Integer.MIN_VALUE;
        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr),each);
            result.put(each,frequency);

        }



    }
}
