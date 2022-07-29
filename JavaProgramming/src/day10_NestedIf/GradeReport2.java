package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {

        int grade =90;


        String result = (grade>=0 && grade <=100)? (grade>=90)? "excellent"
                :(grade>=80)? "great" :(grade>=70)? "good" :(grade>=60)? "pass"
                :"fail"  : "invalid score";
        System.out.println(result);



    }


}
