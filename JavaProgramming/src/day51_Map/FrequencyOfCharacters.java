package day51_Map;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";

        Map<String,Integer> result = new LinkedHashMap<>();

        String[] arr = str.split("");

        for (String each : arr) {
            result.put(each, Collections.frequency(Arrays.asList(arr),each));
        }

        System.out.println(result);

    }
}
