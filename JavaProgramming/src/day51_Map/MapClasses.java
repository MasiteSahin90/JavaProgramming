package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(22,"m");
        hashMap.put(23,"ma");
        hashMap.put(24,"mas");
        hashMap.put(25,"kdfnkdslm");
        hashMap.put(25,"masi");
        hashMap.put(26,"masit");
        hashMap.put(27,"masite");
        hashMap.put(null,"masite");
        hashMap.put(null,"masit");
        hashMap.put(null,"masi");
        hashMap.put(29,null);
        hashMap.put(30,null);
        hashMap.put(31,null);

        System.out.println("hashmap = " + hashMap);


        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(22,"m");
        linkedHashMap.put(23,"ma");
        linkedHashMap.put(24,"mas");
        linkedHashMap.put(25,"kdfnkdslm");
        linkedHashMap.put(25,"masi");
        linkedHashMap.put(26,"masit");
        linkedHashMap.put(27,"masite");
        linkedHashMap.put(null,"masite");
        linkedHashMap.put(null,"masit");
        linkedHashMap.put(null,"masi");
        linkedHashMap.put(29,null);
        linkedHashMap.put(30,null);
        linkedHashMap.put(31,null);

        System.out.println("linkedHashMap = " + linkedHashMap);
        
        Map<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(22,"m");
        treeMap.put(23,"ma");
        treeMap.put(24,"mas");
        treeMap.put(25,"kdfnkdslm");
        treeMap.put(25,"masi");
        treeMap.put(26,"masit");
        treeMap.put(27,"masite");
        treeMap.put(28,null);
        //treeMap.put(null,"masite"); null pointer exception
        //it accepts null value but doesnot accept null key

        System.out.println("treeMap = " + treeMap);
       
        Map<Integer,String> hashtable = new Hashtable<>();

        hashtable.put(22,"m");
        hashtable.put(23,"ma");
        hashtable.put(24,"mas");
        hashtable.put(25,"kdfnkdslm");
        hashtable.put(25,"masi");
        hashtable.put(26,"masit");
        hashtable.put(27,"masite");

        System.out.println("hashtable = " + hashtable);

        hashMap.put(22,"m");
        hashMap.put(23,"ma");
        hashMap.put(24,"mas");
        hashMap.put(25,"kdfnkdslm");
        hashMap.put(25,"masi");
        hashMap.put(26,"masit");
        hashMap.put(27,"masite");
        hashMap.put(null,"masite");
        hashMap.put(null,"masit");
        hashMap.put(null,"masi");
        hashMap.put(29,null);
        hashMap.put(30,null);
        hashMap.put(31,null);

        System.out.println("hashmap = " + hashMap);








    }
}
