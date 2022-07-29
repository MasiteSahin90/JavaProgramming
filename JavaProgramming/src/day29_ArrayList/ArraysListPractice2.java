package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysListPractice2 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("ali","ahmet","daniel","asye","asya"));

        employees.retainAll(Arrays.asList("ahmet","ali"));

        System.out.println(employees);

        String[] names = {"ali","ayse","ahmet","omer","veli","masuk","masite"};

    ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

    list.removeIf(p -> p.startsWith("m"));

        System.out.println(list);

       names=  list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));





    }
}
