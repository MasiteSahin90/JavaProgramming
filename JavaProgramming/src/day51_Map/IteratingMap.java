package day51_Map;

import java.util.*;

public class IteratingMap {

    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();
        students.put("ayse",35);
        students.put("ela",68);
        students.put("saci",93);
        students.put("sena",97);
        students.put("reha",88);
        students.put("masite",95);


        Set<String> keys = students.keySet();

        for (String each : keys) {
            //System.out.println(each + " : " + students.get(each));
            System.out.println(students.replace(each, students.get(each) + 5));
        }

        for(String each : students.keySet()){
            Integer value = students.get(each);
            if (value<90){
                System.out.println(each);
            }
        }
        System.out.println("===========================================");
        Map<String,Integer> earlybirds = new HashMap<>();
        Map<String,Integer> angrybirds = new HashMap<>();

        for (String key : students.keySet()){
            Integer value = students.get(key);
            if (value<90){
                earlybirds.put(key,value);
            }else {
                angrybirds.put(key,value);
            }
        }

        System.out.println("earlybirds = " + earlybirds);
        System.out.println("angrybirds = " + angrybirds);

        Set<String> names= students.keySet();

        //Collection<Integer> scores = students.values();

        List<Integer> scores= new ArrayList<>(students.values());

        System.out.println("scores = " + scores);
        for (Integer value : students.values()) {
            System.out.println(value);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;




        for (Integer score : students.values()) {
            if (score>max){
                max=score;
            }

        }
        System.out.println("max = " + max);

        for (Integer score : students.values()) {
            if (score<min){
                min=score;
            }

        }
        System.out.println("min = " + min);


        System.out.println("===========================================");

        int maxscore = Collections.max(students.values());
        int minscore = Collections.min(students.values());

        System.out.println("minscore = " + minscore);
        System.out.println("maxscore = " + maxscore);


        int count=0;
        for (Integer value : students.values()) {
            if (value>90){
                count++;
            }
        }
        System.out.println(count);

        int c = 0;
        for (String eachKey : students.keySet()) {
            Integer eachScore = students.get(eachKey);

            if (eachScore>90){
               c++;
            }
        }

        System.out.println(c);

        for (Map.Entry<String, Integer> stringIntegerEntry : students.entrySet()) {
            //System.out.println(stringIntegerEntry);
            System.out.println(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue());
        }











    }

}
