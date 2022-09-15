package day51_Map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 145000);
        map.put("Josh", 117000);
        map.put("Cory", 145000);
        map.put("Anderson",125000);
        map.put("Steven", 145000);

    /*    int max = Integer.MIN_VALUE;

        for (Integer eacvalue : map.values()) {
            if (eacvalue>max){
                max=eacvalue;
            }
        }
        System.out.println(max);


        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() == max){
                System.out.println(pair.getKey());
            }
        }*/

        int maxSalary = Collections.max(map.values());
        System.out.println(maxSalary);








    }
}
