package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructor.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

        Car car1 = new Car("toyota");

        car1 = null;

        System.out.println(car1);

        System.out.println("------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "lucy";
        dog1 = new Dog();
        dog1.name = "max";
        System.out.println(dog1);

        System.out.println("------------------------------");


        String language = "phyton";
        language = "java";

        System.out.println(language);

        System.out.println("------------------------------");

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = l1;

        l1.add(100);
        l2.addAll(Arrays.asList(200,300,400));

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1==l2);


        System.out.println("------------------------------");

        Student s1 = new Student("masuk",31,'f','a',32);
        s1.grade='b';

        Student s2 = s1;
        s2.name = "ahmet";

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("------------------------------");

        ArrayList<String> l3 = new ArrayList<>();
        l3.add("java");
        ArrayList<String> l4 = new ArrayList<>();
        l4.add("phyton");

        System.out.println(l3);
        System.out.println(l4);






    }
}
