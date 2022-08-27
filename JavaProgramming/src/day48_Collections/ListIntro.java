package day48_Collections;

import java.util.*;

public class ListIntro {

    public static void main(String[] args) {

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.addAll(Arrays.asList(1,2,3,4,5,6));
        System.out.println(numbers1.get(0));
        List<Integer> numbers2 = new Stack<>();
        numbers2.addAll(Arrays.asList(1,2,3,4,5,6));
        System.out.println(numbers2.get(0));
        List<Integer> numbers3 = new Vector<>();
        numbers3.addAll(Arrays.asList(1,2,3,4,5,6));
        System.out.println(numbers3.get(0));
        List<Integer> numbers4 = new LinkedList<>();
        numbers4.addAll(Arrays.asList(1,2,3,4,5,6));
        System.out.println(numbers4.get(0));

        System.out.println("------------------------------------");

        System.out.println(numbers4);

        ((LinkedList<Integer>) numbers4).pop();



    }

    public synchronized void method1(){

    }
}
