package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(9,8,7,6,5,4,3,2,1));

        Collections.sort(list);

        System.out.println(list);

        ArrayList<Character> ch = new ArrayList<>();

        ch.addAll(Arrays.asList('a','b','c'));

        Collections.reverse(ch);

        System.out.println(ch);

        Collections.swap(ch,0,1);

        System.out.println(ch);

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println(max);

        System.out.println(min);

        System.out.println("=================================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10,10,20,20,20,20,10,10));
        Collections.replaceAll(list2,10,100);
        System.out.println(list2);

        int fr = Collections.frequency(list2,100);
        int fre = Collections.frequency(list2,20);
        System.out.println(fr);
        System.out.println(fre);

    }

}
