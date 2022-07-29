package day21_ForEachLoop;

public class MaximumNumber {
    public static void main(String[] args) {
        int[] numbers = {10,20,0,3,9};
        int max = numbers[0];
        for (int each : numbers) {
            if(each>max){
                max= each;
            }
        }
        System.out.println(max);

    }
}
