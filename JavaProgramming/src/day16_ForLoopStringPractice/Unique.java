package day16_ForLoopStringPractice;

public class Unique {
    public static void main(String[] args) {
        String word = "AABCbC";
        String result ="";

        for (int i = 0; i < word.length() ; i++) {

            char ch = word.charAt(i);

            if(word.lastIndexOf(ch)==word.indexOf(ch) ){
                result += ch;



            }

        }

        System.out.println("result = " + result);

    }
}
