package day50_Collection_Maps;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4));

        System.out.println(set);

       Integer[] array = set.toArray(new Integer[0]);

        List<Integer> list = new ArrayList<>(set);

        System.out.println(list);

        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('a','b','c','d'));

        ((Stack)chars).pop();

        System.out.println(chars);

        List<String> names = new LinkedList<>();

        names.addAll(Arrays.asList("ali","masuk","reha","sacide","sena"));

        System.out.println(names);

        ((LinkedList)names).poll();

        System.out.println(names);





    }
}
