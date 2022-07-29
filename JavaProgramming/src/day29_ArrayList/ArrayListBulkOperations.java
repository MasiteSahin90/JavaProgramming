package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListBulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);

        list.removeAll(Arrays.asList(1,2,3,4));
        System.out.println(list);

        System.out.println("-----------------------");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(100,200,300,400,500,600,700,800,900));

        list2.retainAll(Arrays.asList(100,200,300));

        System.out.println(list2);

        ArrayList<String> jobTitles = new ArrayList<>();

        jobTitles.addAll(Arrays.asList("QA","SDET","Developers","Scrum Master"));

        jobTitles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(jobTitles);

        System.out.println("-----------------------");

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        boolean r1 = nums.containsAll(Arrays.asList(1,2,3,4));
        boolean r2 = nums.containsAll(Arrays.asList(100,200));

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("-----------------------");

        String[] names = {"ali", "ayse","aycan","ahmet"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));

        //namesList.addAll(Arrays.asList(names));

        System.out.println(namesList);

        System.out.println("-----------------------");

        //int[] arr = {1,2,3,4,5,6,7,8,9,10};

        //ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> listt = new ArrayList<>(convertToArrayList(arr));
        System.out.println(listt);




 }

    public static ArrayList<Integer> convertToArrayList(int[] array){

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;
    }


}
