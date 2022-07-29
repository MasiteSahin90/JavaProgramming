package day09_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        
        int grade = 567;
        char letter ;
        
        if (grade<=100 && grade>=90){
            letter = 'A';
        } else if (grade<= 89 && grade>=80) {
            letter = 'B';
        } else if (grade<= 79 &&grade>=70) {
            letter ='C';
        } else if (grade<= 69 &&grade >= 60) {
            letter = 'D';
        } else {
            letter = 'F';
        }
        System.out.println("letter = " + letter);
    }
}
