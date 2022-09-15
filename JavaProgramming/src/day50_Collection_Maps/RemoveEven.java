package day50_Collection_Maps;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveEven {

    public static void main(String[] args) {

        Set<Integer> nums = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        //nums.removeIf(p-> p%2==0);
        Iterator<Integer> it = nums.iterator();

        while (it.hasNext()){
            if (it.next() % 2 == 0){
                it.remove();
            }
        }
        System.out.println(nums);



    }
}
