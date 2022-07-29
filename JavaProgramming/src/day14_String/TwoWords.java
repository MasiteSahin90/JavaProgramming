package day14_String;

public class TwoWords {
    public static void main(String[] args) {
        /*
        Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

         */

        String w1 = "apple";
        //           01234
        String w2 = "banana";
        //           012345

        String sub1 = w1.substring(1);
        String sub2 = w2.substring(1);
        System.out.println(sub1 + sub2);




    }
}
