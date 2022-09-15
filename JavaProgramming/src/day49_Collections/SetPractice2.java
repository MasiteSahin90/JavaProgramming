package day49_Collections;

import java.util.*;

public class SetPractice2 {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon","Book","Pen","Phone","Wooden Spoon"
                , "Wooden Spoon","Wooden Spoon","Wooden Spoon","Milk","Eggs","Coke"
                ,"Paper Towels"};

        arr = new HashSet<>(Arrays.asList(arr)).toArray(new String[0]);


        /*
        Set<String> set1 = new HashSet<>(Arrays.asList(arr));

        System.out.println("set1 = " + set1);
        arr = set1.toArray(new String[0]);

        System.out.println(Arrays.toString(arr));
*/


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(10,20,20,30,30,50,30,40,40,300,4005,43,34,45));

        numbers = new ArrayList<>(new LinkedHashSet<>(numbers));

        System.out.println(numbers);


        System.out.println("---------------------------------");

        String[] array = {"a","a","b","c"};

        Set<String > s = new LinkedHashSet<>();
        List<String > str = new ArrayList<>();
        str.addAll(Arrays.asList(array));
        s.addAll(Arrays.asList(array));
        str.addAll(Arrays.asList("e","f","g"));

        String str1 = "aaaaabbbbbcccccdddddeeee";
        String result = "";
        //String[] arr1 = str1.split("");

        //arr1= new LinkedHashSet<>(Arrays.asList(arr1)).toArray(s.toArray(new String[0]));
       // System.out.println(Arrays.toString(arr1));

        for(String each :new LinkedHashSet<>(Arrays.asList(str1.split("")))){
           int count = Collections.frequency(Arrays.asList(str1.split("")),each);
           //result += each + Collections.frequency(Arrays.asList(str1.split("")),each);

           result+= each+count;
        }
        System.out.println("result = " + result);



        Integer[] nums = {1,2,2,10,10,9,9,2,1,1,3,3,4,4,5,5,6,6,7,7,7,8};
        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums));
        System.out.println(nums[5]);

        System.out.println("---------------------------------");

        Set<String> names = new LinkedHashSet<>();

        names.addAll(Arrays.asList("Ahmet","Ahmet","ali","veli"));

        System.out.println(names.toArray(new String[0])[2]);

        for (String each : names) {
            System.out.println(each);
        }















    }



}
