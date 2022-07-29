package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(100,90,75,85,65,85,55,45,73,35,45));

        ArrayList<Integer> gradeA = new ArrayList<>(scores);
        gradeA.removeIf(p-> !(p>=90));
        System.out.println(gradeA);

        ArrayList<Integer> gradeB = new ArrayList<>(scores);
        gradeB.removeIf(p-> !(p>=80 && p<=89));
        System.out.println(gradeB);

        ArrayList<Integer> gradeC = new ArrayList<>(scores);
        gradeC.removeIf(p-> !(p<80 && p>=70));
        System.out.println(gradeC);

        ArrayList<Integer> gradeD = new ArrayList<>(scores);
        gradeD.removeIf(p-> !(p<70 && p>=60));
        System.out.println(gradeD);

        ArrayList<Integer> gradeF = new ArrayList<>(scores);
        gradeF.removeIf(p-> !(p<60 ));
        System.out.println(gradeF);

        System.out.println("gradeA = " + gradeA.size());
        System.out.println("gradeB = " + gradeB.size());
        System.out.println("gradeC = " + gradeC.size());
        System.out.println("gradeD = " + gradeD.size());
        System.out.println("gradeF = " + gradeF.size());




    }
}
