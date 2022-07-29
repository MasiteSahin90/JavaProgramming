package day28_ArraysList;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);

        for (int i = 0; i < num.size(); i++) {
            num.set(i,num.get(i)*2);
        }

        System.out.println(num);

        System.out.println("--------------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("ayse");
        employees.add("ali");
        employees.add("ahmet");
        employees.add("ayla");
        employees.add("aylin");
        employees.add("aygun");
        employees.add("aycan");

        System.out.println(employees);

        employees.remove(1);

        System.out.println(employees);

        employees.remove(1);

        System.out.println(employees);

        employees.remove(1);

        System.out.println(employees);

        employees.remove(employees.size()-1);

        System.out.println(employees);

        employees.remove("aylin");

        System.out.println(employees);

    }
}
