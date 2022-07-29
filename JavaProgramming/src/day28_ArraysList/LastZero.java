package day28_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class LastZero {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));

        list.set(list.size()-1 , 0);

        System.out.println(list);

        int temp = list.get(list.size()-1);

        list.set(list.size() - 1, list.get(0));
        list.set(0, temp);

        System.out.println(list);

        ArrayList<Double> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1.1 ,1.2));


        for (int i = 0; i<=list2.size()-1;i++) {
            list2.set(i, list2.get(i) *2);
        }
        System.out.println(list2);

        System.out.println("===================================");

        ArrayList<Integer>  scores = new ArrayList<>();
        int grade = 0;
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));
        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        for (Integer each : scores) {
            if (each>=90){
                gradeOfA.add(each);
            } else if (each>=80) {
                gradeOfB.add(each);
            } else if (each>=70) {
                gradeOfC.add(each);
            } else if (each>=60) {
                gradeOfD.add(each);
            }else{
                gradeOfF.add(each);
            }
            System.out.println( gradeOfA.size());
            System.out.println( gradeOfB.size());
            System.out.println( gradeOfC.size());
            System.out.println( gradeOfD.size());
            System.out.println( gradeOfF.size());




        }
    }
}
