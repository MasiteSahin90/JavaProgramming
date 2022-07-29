package day08_IfStatements;

public class GradeLevelDetermine {
    public static void main(String[] args) {


        //2.  Given a number(byte) grade level determine and print which school type someone is in.
        //            grade level and types are:
        //                    1-5: Elementary school
        //                    6-8: Middle school
        //                    9-12: High school
        //                    13-16: College
        //                    17-18: Grad School
        //
        //        	Assume that the given number is 1 ~ 18

        byte gradeLevel = 15;
        if (gradeLevel >= 1 && gradeLevel <= 18) {
            if (gradeLevel <= 5) {
                System.out.println("Elementary School");
            } else if (gradeLevel <= 8) {
                System.out.println("Middle School");
            } else if (gradeLevel <= 12) {
                System.out.println("High School");
            } else if (gradeLevel <= 16) {
                System.out.println("College");
            } else {
                System.out.println("Grad School");
            }
        } else {
            System.out.println("Invalid Grade");
        }

        System.out.println("-------------------------");

        String school = (gradeLevel <= 5)? "Elementary School" :(gradeLevel <= 8)? "Middle School"
                :(gradeLevel <= 12)? "High School" :(gradeLevel <= 16)? "College" : "Grad School";
        System.out.println(school);






    }
}
