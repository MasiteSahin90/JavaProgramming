package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        String name1 = "";
        int maxSalary=Integer.MIN_VALUE;
        String name2 = "";
        int minSalary=Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String eachKey = entry.getKey();
            Integer eachValue = entry.getValue();

            if (maxSalary<eachValue){
                maxSalary= eachValue;
                name1=eachKey;
            }

            if (minSalary>eachValue){
                minSalary=eachValue;
                name2=eachKey;
            }
        }
        System.out.println(name1);
        System.out.println(name2);


        int count = 0;

        for (Integer value : map.values()) {
            if (value>=120000 && value<=150000){
                count++;
            }
        }
        System.out.println(count);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue()<118000){
                System.out.println(pair.getKey());
            }
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue()<120000){

                pair.setValue(pair.getValue()+10000);
            }
        }
        System.out.println(map);

    }
}
