package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6));

        Collections.swap(numbers,0,numbers.size()-1);

        System.out.println(numbers);

        System.out.println("-------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println(list);
        int size = list.size();

        list.removeAll(Arrays.asList(0));
        System.out.println(list);

        int size2nd = list.size();

        int totalZero= size-size2nd;

        System.out.println(totalZero);

        for (int i = 0; i < totalZero; i++) {
            list.add(0);
        }
        System.out.println(list);

        System.out.println("============================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println("====================");

        String str = "ABC1234!@£$%^789$%^&DEF";

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }

        ArrayList<Character> letters= new ArrayList<>(chars);

        letters.removeIf(p-> !(Character.isLetter(p)));

        System.out.println(letters);

        ArrayList<Character> digits= new ArrayList<>(chars);

        digits.removeIf(p-> !(Character.isDigit(p)));

        System.out.println(digits);

        ArrayList<Character> specialch= new ArrayList<>(chars);

        //digits.removeIf(p-> !(Character.isLetterOrDigit(p)));

        specialch.removeAll(letters);
        specialch.removeAll(digits);

        System.out.println(specialch);



    }
}
