package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargest {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));



        int n = 3;
        for (int i = 1; i <n ; i++) {
            numbers.removeIf(p->Collections.max(numbers)==p);
        }
        int max =Collections.max(numbers);
        System.out.println(max);


    }
}
