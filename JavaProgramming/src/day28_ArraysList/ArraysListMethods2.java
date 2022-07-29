package day28_ArraysList;

import java.util.ArrayList;

public class ArraysListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(300);
        list.add(400);

        System.out.println(list);

        int num = 1;

        list.remove(num);

        System.out.println(list);

        Integer numb = 200;
        boolean r = list.remove(numb);

        System.out.println(list);

        System.out.println(r);

        System.out.println("------------------------");

        list.clear();

        System.out.println(list);



    }
}
