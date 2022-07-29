package day24_CustomMethods_Return;

public class ReturnMethodPractice2 {

    public static void main(String[] args) {

        String str = grade(-8);

        if (str.equals("A")){
            System.out.println("excellent");
        } else if (str.equals("B")) {
            System.out.println("great");
        } else if (str.equals("C")) {
        System.out.println("good");
        } else if (str.equals("D")) {
            System.out.println("pass");
        }else {
            System.out.println("try again");
        }



        }

    public static String grade(int score){

        String result = "";

        if(score<0 || score>100){
            result = "invalid";
        }else{

            result = (score>=90)? "A" : (score>=80)? "B" :(score>=70)?"C" :(score >=60)? "D" : "F";
        }

        return result;
    }

}
