package day09_IfStatements;

public class PassOrFail {
    public static void main(String[] args) {

        int score = 90;
        boolean pass = score >= 60;
        if (pass){
            System.out.println("Congrats you pass");
        }else{
            System.out.println(("you failed"));
        }
    }
}
