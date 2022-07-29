package day21_ForEachLoop;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {

        int[] num = {1,2,3,6,7,4,9};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        int[] result = new int[num.length];

        for (int i = num.length-1 ,j = 0; i >=0 ; i-- ,j++) {
            result[j] += num[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
