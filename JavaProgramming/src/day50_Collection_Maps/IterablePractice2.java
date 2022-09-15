package day50_Collection_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Ahmed","ahmeD","aHmed","john",
                "ercan","daniel","mustafa","mohammed","ahmed","ahmed",
                "yulia","chris"));
     /*   names.removeIf(p-> p.equalsIgnoreCase("ahmed"));

        System.out.println(names);*/

        Iterator<String> it = names.iterator();

       /* while (it.hasNext()){
            if (it.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }
*/
        //System.out.println(names);

        for (Iterator<String> i = names.iterator(); i.hasNext();){
            if (i.next().equalsIgnoreCase("ahmed")){
                i.remove();
            }
        }
        System.out.println(names);







    }
}
