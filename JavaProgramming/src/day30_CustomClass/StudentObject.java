package day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setInfo("masuk",'f',31,2215,'a');
        System.out.println(s1);

        Student  s2 = new Student();
        s2.setInfo("ayse",'f',43,2334,'b');
        System.out.println(s2);

        Student s3 = new Student();
        s3.setInfo("ali",'m',33,3433,'d');
        System.out.println(s3);

        Student s4 = new Student();
        s4.setInfo("saci",'f',6 , 4323,'a');
        System.out.println(s4);

        Student[] students = {s1,s2,s3,s4};

        for (Student each : students){
            System.out.println(each);
        }


        ArrayList<Student> earlyBirds = new ArrayList<>();
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student each : students) {
            if (each.grade == 'a'){
                earlyBirds.add(each);
            }else {
                angryBirds.add(each);
            }
        }

        System.out.println(" early = " + earlyBirds);
        System.out.println("angry = " + angryBirds);















    }



}
