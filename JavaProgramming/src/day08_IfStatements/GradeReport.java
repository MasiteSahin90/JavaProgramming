package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 45;
        if (score >=90 && score <= 100 ){
            System.out.println("Excellent");
        }
        if (score >= 80 && score <= 89){
            System.out.println("Great");
        }
        if (score >= 70 && score <=79){
            System.out.println("Good");
        }
        if (score >= 60 && score <=69){
            System.out.println("Passed");
        }
        if (score <=59 && score >=0){
            System.out.println("Failed");
        }





    }
}
/* score
90 - 100 excellent
80 -89 great
70-79 good
60-69 passed
0-59 failed

 */