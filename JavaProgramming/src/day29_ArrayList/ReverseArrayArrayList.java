package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayArrayList {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7};

        int[] reverse = new int[array.length];
        for (int i = array.length - 1 ,j=0; i >= 0; i--,j++) {
            reverse[j]+=array[i];
        }
        System.out.println(Arrays.toString(reverse));


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        ArrayList<Integer> reverseList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            int each = list.get(i);
            reverseList.add(each);
        }
        System.out.println(reverseList);
    }
}
