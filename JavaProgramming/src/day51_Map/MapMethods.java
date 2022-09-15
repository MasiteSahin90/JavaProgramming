package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        Map<String,Integer> studentsScore = new HashMap<>();

        studentsScore.put("Masite",100);
        studentsScore.put("Reha",99);
        studentsScore.put("Sacide",98);
        studentsScore.put("Sena",97);
        studentsScore.put("Ali",10);
        studentsScore.put("Meli",66);
        studentsScore.put("Veli",27);

        studentsScore.put("Veli",32);
        studentsScore.put("Veli",46);

        System.out.println("studentsScore = " + studentsScore);

        System.out.println(studentsScore.size());

        System.out.println(studentsScore.get("Sacide"));

        studentsScore.replace("Meli",71);

        System.out.println("studentsScore = " + studentsScore);

        studentsScore.remove("Veli");
        studentsScore.remove("Meli");

        System.out.println("studentsScore = " + studentsScore);

        System.out.println(studentsScore.size());


        boolean r1 = studentsScore.containsKey("Muhtar");
        boolean r2 = studentsScore.containsKey("Masite");

        System.out.println(r1);
        System.out.println(r2);


        boolean r3 = studentsScore.containsValue(98);
        boolean r4 = studentsScore.containsValue(77);

        System.out.println(r3);
        System.out.println(r4);

        System.out.println("studentsScore.isEmpty() = " + studentsScore.isEmpty());

        Map<String,Integer> map1 = new HashMap<>();
        map1.putAll(studentsScore);
        Map<String,Integer> map2 = new HashMap<>();
        map2.putAll(studentsScore);

        System.out.println("map1.equals(map2) = " + map1.equals(map2));

    }
}
