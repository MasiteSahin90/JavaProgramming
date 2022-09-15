package day50_Collection_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteralblePractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        list.removeIf(p-> p<4);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        Iterator<Integer> it = list2.iterator();

       /* boolean r1 = it.hasNext();
        System.out.println(r1);

        System.out.println(it.next());
*/
        while (it.hasNext()){
            if (it.next()<4){
                it.remove();
            }
        }
        System.out.println(list2);


        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        for (Iterator<Integer> i = list3.iterator(); i.hasNext();){
            if (i.next()<4){
                i.remove();
            }
        }
        System.out.println(list3);


    }
}
