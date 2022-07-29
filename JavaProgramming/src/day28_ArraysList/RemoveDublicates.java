package day28_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDublicates {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(10);
        numbers.add(40);
        numbers.add(40);
        numbers.add(50);
        numbers.add(50);
        
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : numbers) {
            if (result.contains(each)){
                continue;
            }
            result.add(each);
            /*
            if (!(result.contains(each))){
                result.add(each);
            }

             */
        }
        System.out.println(result);


        System.out.println("-----------------------------------");


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(20);
        list1.add(30);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(30);

        System.out.println(list1.equals(list2));

        System.out.println("------------------------");

        boolean r4 = list1.isEmpty();
        System.out.println(r4);

        System.out.println("-------------------");


        ArrayList<Integer> number = new ArrayList<>();

        number.addAll(Arrays.asList(1,2,3,4,5,6));

        System.out.println(number);
    }
}
