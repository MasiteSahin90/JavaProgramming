package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int grade = 590;
        if (grade>=0 && grade<=100){
            if (grade>=90){
                System.out.println("Excellent");
            }else if (  grade >=80){
                System.out.println("Great");
            } else if (grade >=70) {
                System.out.println("Good");
            }else if ( grade >=60) {
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
        }else {
            System.out.println("Invalid Grade");
        }
    }
}
