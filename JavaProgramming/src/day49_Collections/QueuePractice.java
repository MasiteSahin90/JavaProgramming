package day49_Collections;

import java.util.*;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<Integer> q1 = new PriorityQueue<>();

        q1.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("PriorityQueue=" + q1);

        Queue<Integer> q2 = new ArrayDeque<>();

        q2.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("ArrayDeque=" + q2);

        Queue<Integer> q3 = new LinkedList<>();

        q3.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("LinkedList=" + q3);

        System.out.println("------------------------");

        q1.poll();
        System.out.println("q1 = " + q1);

        q2.poll();
        System.out.println("q2 = " + q2);

        q3.poll();
        System.out.println("q3 = " + q3);

        //System.out.println(q1.get(1));
        //System.out.println(q2.get(1));
        //System.out.println(q3.get(1));

        System.out.println(((List)q3).get(1));
        System.out.println(((LinkedList)q3).get(1));

    }
}
