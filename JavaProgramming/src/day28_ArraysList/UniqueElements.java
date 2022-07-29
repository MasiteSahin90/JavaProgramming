package day28_ArraysList;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("ayse");
        list.add("ayse");
        list.add("ahmet");
        list.add("ahmet");
        list.add("aylin");
        list.add("aycan");
        list.add("aycan");

        System.out.println(list);

        ArrayList<String> unique = new ArrayList<>();

        for (String each : list) {
            if (list.indexOf(each) == list.lastIndexOf(each)){
                unique.add(each);
            }
        }

        System.out.println(unique);

        System.out.println("----------------------");

        boolean r1 = list.contains("aycan");
        boolean r2 = list.contains("masuk");

        System.out.println(r1);
        System.out.println(r2);
    }
}
