package day33_Statics;

import java.util.Arrays;

public class StudentObject {

    public static void main(String[] args) {
        Student s1 = new Student("masite");
        Student s2 = new Student("masite", 'f',31);
        Student s3 = new Student("masite", 'f',31,32);
        Student s4 = new Student("masite", 'f',31,32,'A');
        Student s5 = new Student("masite", 'f');


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        System.out.println(s1==s2);

        Student[] students = {s1,s2,s3,s4,s5};

        System.out.println(Arrays.toString(students));









    }


}
