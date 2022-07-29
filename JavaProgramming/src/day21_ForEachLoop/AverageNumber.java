package day21_ForEachLoop;

public class AverageNumber {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8};
        double average= 0.0;
        double sum = 0;
        for (int each : number) {

           sum+=each;
           average = sum/number.length;
        }

        System.out.println(average);
    }
}
